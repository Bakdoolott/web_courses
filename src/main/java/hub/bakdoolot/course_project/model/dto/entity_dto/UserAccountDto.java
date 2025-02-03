package hub.bakdoolot.course_project.model.dto.entity_dto;

import hub.bakdoolot.course_project.model.enums.Role;
import hub.bakdoolot.course_project.model.enums.Status;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAccountDto {
    Long id;
    String email;
    String phoneNumber;
    String password;
    Role role;
    Status status;
}
