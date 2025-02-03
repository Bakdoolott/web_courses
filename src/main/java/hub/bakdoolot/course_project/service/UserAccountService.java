package hub.bakdoolot.course_project.service;

import hub.bakdoolot.course_project.model.dto.entity_dto.UserAccountDto;

import java.util.Optional;


public interface UserAccountService {
    UserAccountDto createAccount(UserAccountDto userAccountDto);
    UserAccountDto getUserAccountByPhoneOfEmail(String login);
}
