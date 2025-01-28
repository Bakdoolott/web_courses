package hub.bakdoolot.course_project.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "users")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Column(nullable = false)
    String firstname;
    @Column(nullable = false)
    String lastname;

    @OneToOne
    @JoinColumn(name = "id_account")
    UserAccount account;
}
