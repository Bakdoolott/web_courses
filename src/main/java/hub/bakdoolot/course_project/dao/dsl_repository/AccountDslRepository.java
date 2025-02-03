package hub.bakdoolot.course_project.dao.dsl_repository;

import hub.bakdoolot.course_project.tables.UserAccount;
import hub.bakdoolot.course_project.tables.records.UserAccountRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class AccountDslRepository {
    private final DSLContext dslContext;
    public Optional<UserAccountRecord> findByPhoneOrEmail(String login) {
        return
                dslContext.selectFrom(UserAccount.USER_ACCOUNT)
                        .where(UserAccount.USER_ACCOUNT.EMAIL.eq(login).or(UserAccount.USER_ACCOUNT.PHONE_NUMBER.eq(login)))
                .limit(1)
                        .fetchOptionalInto(UserAccountRecord.class);
    }
}