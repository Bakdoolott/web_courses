package hub.bakdoolot.course_project.service.impl;

import hub.bakdoolot.course_project.config.mapper.MapperConfig;
import hub.bakdoolot.course_project.dao.jpa.UsersRepository;
import hub.bakdoolot.course_project.model.dto.entity_dto.UsersDto;
import hub.bakdoolot.course_project.model.entity.Users;
import hub.bakdoolot.course_project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UsersRepository usersRepository;
    private final MapperConfig mapperConfig;
    @Override
    public UsersDto createUser(UsersDto usersDto) {
        return mapperConfig.getMapper().map(
                usersRepository.save(
                        mapperConfig.getMapper().map(
                                usersDto, Users.class
                        )
                ), UsersDto.class
        );
    }
}
