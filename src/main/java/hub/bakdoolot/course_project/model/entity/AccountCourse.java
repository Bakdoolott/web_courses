package hub.bakdoolot.course_project.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "account_course")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_account")
    UserAccount account;
    @ManyToOne
    @JoinColumn(name = "id_course")
    Course course;
}
