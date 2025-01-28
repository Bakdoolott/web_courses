package hub.bakdoolot.course_project.service;

import hub.bakdoolot.course_project.model.dto.request.SignUp;
import hub.bakdoolot.course_project.model.dto.responnse.UserDetailsResponse;

public interface AuthService {

    UserDetailsResponse signUp(SignUp signUp);
}
