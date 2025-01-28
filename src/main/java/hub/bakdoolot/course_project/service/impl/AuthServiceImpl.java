package hub.bakdoolot.course_project.service.impl;

import hub.bakdoolot.course_project.config.mapper.MapperConfig;
import hub.bakdoolot.course_project.dao.jpa.UserAccountRepository;
import hub.bakdoolot.course_project.model.dto.entity_dto.UserAccountDto;
import hub.bakdoolot.course_project.model.dto.request.SignUp;
import hub.bakdoolot.course_project.model.dto.responnse.UserDetailsResponse;
import hub.bakdoolot.course_project.service.AuthService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
//    private final UserAccountRepository userAccountRepository;
//    private final MapperConfig mapper;

    @Override
    public UserDetailsResponse signUp(SignUp signUp) {
//        UserAccountDto userAccountDto = new UserAccountDto();
//        userAccountDto.setEmail(signUp.login());
//        userAccountDto.setPassword(signUp.password());
//        userAccountDto.set

//        return mapper.getMapper().map(
//
//        )
        return null;
    }
}
