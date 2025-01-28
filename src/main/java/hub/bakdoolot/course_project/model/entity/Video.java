package hub.bakdoolot.course_project.model.entity;

import hub.bakdoolot.course_project.model.enums.Category;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "video")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String url;
    Integer views;
    Integer like;
    @Enumerated(EnumType.STRING)
    Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_account")
    UserAccount account;
}
