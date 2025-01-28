package hub.bakdoolot.course_project.model.entity;

import hub.bakdoolot.course_project.model.enums.RatingPoint;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "rating")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    @Enumerated(EnumType.STRING)
    RatingPoint ratingPoint;
}
