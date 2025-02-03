package hub.bakdoolot.course_project.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SignUp {
    @NotBlank
    String firstName;
    @NotBlank
    String lastName;
    @NotBlank
    String login;
    @NotBlank
    String password;
}
