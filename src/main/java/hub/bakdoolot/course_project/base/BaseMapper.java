package hub.bakdoolot.course_project.base;

import jakarta.persistence.MappedSuperclass;

import java.util.List;

@MappedSuperclass
public interface BaseMapper<ENTITY, DTO> {
    ENTITY toEntity(DTO dto);
    DTO toDto(ENTITY entity);
    List<ENTITY> toEntities(List<DTO> dtos);
    List<DTO> toDtos(List<ENTITY> entities);


}