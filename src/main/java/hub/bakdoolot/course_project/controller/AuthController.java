package hub.bakdoolot.course_project.controller;

import hub.bakdoolot.course_project.model.dto.request.SignIn;
import hub.bakdoolot.course_project.model.dto.request.SignUp;
import hub.bakdoolot.course_project.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/sign-in")
    RequestEntity<?> signIn(@RequestBody SignIn signIn) {
        return null;
    }

    @PostMapping("/sign-up")
    RequestEntity<?> signUp(@RequestBody SignUp signUp) {
//        return new RequestEntity<>(authService.signUp(signUp), HttpStatus.OK);
        return null;
    }
}
