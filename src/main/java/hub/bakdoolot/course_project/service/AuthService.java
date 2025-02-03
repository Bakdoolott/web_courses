package hub.bakdoolot.course_project.service;

import hub.bakdoolot.course_project.model.dto.request.SignInRequest;
import hub.bakdoolot.course_project.model.dto.request.SignUp;

public interface AuthService {

    String signUp(SignUp signUp);

    String signIn(SignInRequest signIn);
}
