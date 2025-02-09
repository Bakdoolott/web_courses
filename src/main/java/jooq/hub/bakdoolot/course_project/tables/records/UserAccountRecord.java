/*
 * This file is generated by jOOQ.
 */
package hub.bakdoolot.course_project.tables.records;


import hub.bakdoolot.course_project.tables.UserAccount;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class UserAccountRecord extends UpdatableRecordImpl<UserAccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_account.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_account.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user_account.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_account.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user_account.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_account.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user_account.phone_number</code>.
     */
    public void setPhoneNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user_account.phone_number</code>.
     */
    public String getPhoneNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user_account.role</code>.
     */
    public void setRole(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user_account.role</code>.
     */
    public String getRole() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user_account.status</code>.
     */
    public void setStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user_account.status</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserAccountRecord
     */
    public UserAccountRecord() {
        super(UserAccount.USER_ACCOUNT);
    }

    /**
     * Create a detached, initialised UserAccountRecord
     */
    public UserAccountRecord(Long id, String email, String password, String phoneNumber, String role, String status) {
        super(UserAccount.USER_ACCOUNT);

        setId(id);
        setEmail(email);
        setPassword(password);
        setPhoneNumber(phoneNumber);
        setRole(role);
        setStatus(status);
        resetChangedOnNotNull();
    }
}
