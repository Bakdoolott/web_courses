package hub.bakdoolot.course_project.service;

import hub.bakdoolot.course_project.model.entity.UserAccount;

import java.util.Optional;

public interface UserAccountService {
    Optional<UserAccount> findUserAccountByPhoneNumber(String login);
}
