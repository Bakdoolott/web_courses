package hub.bakdoolot.course_project.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "comment")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_video")
    Video video;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account")
    UserAccount userAccount;
}
