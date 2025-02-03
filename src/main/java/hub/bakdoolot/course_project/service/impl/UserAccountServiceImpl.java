package hub.bakdoolot.course_project.service.impl;

import hub.bakdoolot.course_project.config.mapper.MapperConfig;
import hub.bakdoolot.course_project.dao.jpa.UserAccountRepository;
import hub.bakdoolot.course_project.exception.NotFoundException;
import hub.bakdoolot.course_project.model.dto.entity_dto.UserAccountDto;
import hub.bakdoolot.course_project.model.entity.UserAccount;
import hub.bakdoolot.course_project.service.UserAccountService;
import hub.bakdoolot.course_project.dao.dsl_repository.AccountDslRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;
    private final AccountDslRepository accountDslRepository;
    private final MapperConfig mapperConfig;

    @Override
    public UserAccountDto createAccount(UserAccountDto userAccountDto) {
        return mapperConfig.getMapper().map(
                userAccountRepository.save(
                        mapperConfig.getMapper().map(
                                userAccountDto, UserAccount.class
                        )
                ), UserAccountDto.class
        );
    }

    @Override
    public UserAccountDto getUserAccountByPhoneOfEmail(String login) {
        return accountDslRepository.findByPhoneOrEmail(login)
                .map(userAccount -> mapperConfig.getMapper().map(userAccount, UserAccountDto.class))
                .orElseThrow(() -> new NotFoundException("User not found"));
    }
}
