package hub.bakdoolot.course_project.dao.jpa;

import hub.bakdoolot.course_project.model.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
    Optional<UserAccount> findUserAccountByPhoneNumber(String login);
}
