package hub.bakdoolot.course_project.service.impl;

import hub.bakdoolot.course_project.config.jwt.JwtService;
import hub.bakdoolot.course_project.exception.AlreadyExistsException;
import hub.bakdoolot.course_project.exception.BlockedException;
import hub.bakdoolot.course_project.exception.NotFoundException;
import hub.bakdoolot.course_project.exception.WrongTypeException;
import hub.bakdoolot.course_project.model.dto.entity_dto.UserAccountDto;
import hub.bakdoolot.course_project.model.dto.entity_dto.UsersDto;
import hub.bakdoolot.course_project.model.dto.request.SignInRequest;
import hub.bakdoolot.course_project.model.dto.request.SignUp;
import hub.bakdoolot.course_project.model.enums.Role;
import hub.bakdoolot.course_project.model.enums.Status;
import hub.bakdoolot.course_project.service.AuthService;
import hub.bakdoolot.course_project.service.UserAccountService;
import hub.bakdoolot.course_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserAccountService userAccountService;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @Override
    public String signUp(SignUp signUp) {
        try {
            userAccountService.getUserAccountByPhoneOfEmail(signUp.getLogin());
        }catch (NotFoundException ignored){}

        UserAccountDto userAccountDto = new UserAccountDto();
        userAccountDto.setEmail(signUp.getLogin());
        if(signUp.getLogin().contains("@")){
            userAccountDto.setEmail(signUp.getLogin());
            userAccountDto.setPhoneNumber(null);
        }else{
            signUp.setLogin(signUp.getLogin().replace("+", ""));
            userAccountDto.setEmail(null);
            try {
                userAccountDto.setPhoneNumber(String.valueOf(Integer.getInteger(signUp.getLogin())));
            }catch (NumberFormatException ignored){
                throw new WrongTypeException("Туура жаз сгейн");
            }
        }
        userAccountDto.setPassword(passwordEncoder.encode(signUp.getPassword()));
        userAccountDto.setRole(Role.USER);

        userAccountDto = userAccountService.createAccount(userAccountDto);

        UsersDto usersDto = new UsersDto();
        usersDto.setFirstname(signUp.getFirstName());
        usersDto.setLastname(signUp.getLastName());
        usersDto.setAccount(userAccountDto);

        userService.createUser(usersDto);

        return jwtService.generateToken(userAccountDto.getEmail(), userAccountDto.getRole().toString());
    }

    @Override
    public String signIn(SignInRequest signIn) {
        UserAccountDto userAccountDto = userAccountService.getUserAccountByPhoneOfEmail(signIn.login());
        if(userAccountDto.getStatus().toString().equalsIgnoreCase(Status.ACTIVE.toString()) &&
                passwordEncoder.matches(signIn.password(), userAccountDto.getPassword())
        ) {
            return jwtService.generateToken(userAccountDto.getEmail(), userAccountDto.getRole().toString());
        }else
            throw new BlockedException("User is not active");
    }
}
