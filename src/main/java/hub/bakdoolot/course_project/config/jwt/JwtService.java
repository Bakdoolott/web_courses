package hub.bakdoolot.course_project.config.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import hub.bakdoolot.course_project.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class JwtService {
    private final UserAccountService userAccountService;

    @Value("${jwt.secret.key}")
    private String secretKey;

    String generateToken(UserDetails userDetails) {
        return JWT.create()
                .withClaim("login", userDetails.getUsername())
                .withIssuedAt(new Date())
                .withExpiresAt(Date.from(ZonedDateTime.now().plusWeeks(4).toInstant()))
                .sign(Algorithm.HMAC512(secretKey));
    }

    String verifyToken(String token) {
        JWTVerifier jwtVerifier = JWT
                .require(Algorithm.HMAC512(secretKey))
                .build();
        DecodedJWT jwt = jwtVerifier.verify(token);
        return jwt.getClaim("login").asString();
    }
}
