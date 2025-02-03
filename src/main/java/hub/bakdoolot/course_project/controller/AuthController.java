package hub.bakdoolot.course_project.controller;

import hub.bakdoolot.course_project.model.dto.request.SignInRequest;
import hub.bakdoolot.course_project.model.dto.request.SignUp;
import hub.bakdoolot.course_project.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:3000", "http://0.0.0.0:3000"})
public class AuthController {
    private final AuthService authService;

    @GetMapping("/sign-in")
    ResponseEntity<?> signIn(SignInRequest signIn) {
        return new ResponseEntity<>(authService.signIn(signIn), HttpStatus.OK);
    }

    @PostMapping("/sign-up")
    ResponseEntity<?> signUp(@RequestBody SignUp signUp) {
        return new ResponseEntity<>(authService.signUp(signUp), HttpStatus.CREATED);
    }
}