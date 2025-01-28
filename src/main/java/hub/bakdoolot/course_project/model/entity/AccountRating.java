package hub.bakdoolot.course_project.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "account_rating")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountRating {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_account")
    UserAccount userAccount;
    @ManyToOne
    @JoinColumn(name = "id_rating")
    Rating rating;
}
