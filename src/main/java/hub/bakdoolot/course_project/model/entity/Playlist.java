package hub.bakdoolot.course_project.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "playlist")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @ManyToOne
    @JoinColumn(name = "id_account")
    UserAccount account;
    @ManyToOne
    @JoinColumn(name = "id_account_course")
    AccountCourse course;
}
