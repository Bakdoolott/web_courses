package hub.bakdoolot.course_project.model.dto.entity_dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsersDto {
    Long id;
    String firstname;
    String lastname;
    String avatar;


    UserAccountDto account;
}
