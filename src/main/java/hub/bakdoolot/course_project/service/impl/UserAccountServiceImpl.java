package hub.bakdoolot.course_project.service.impl;

import hub.bakdoolot.course_project.dao.jpa.UserAccountRepository;
import hub.bakdoolot.course_project.model.entity.UserAccount;
import hub.bakdoolot.course_project.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;
    @Override
    public Optional<UserAccount> findUserAccountByPhoneNumber(String login) {
        return userAccountRepository.findUserAccountByPhoneNumber(login);
    }
}
