package com.saksa.utils.mapper;

import com.saksa.entity.ActorEntity;
import com.saksa.utils.dto.ActorDto;
import org.mapstruct.*;
import java.util.Collection;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ActorMapper {

    @Named("ActorMapper.toDto")
    public ActorDto toDto(ActorEntity entity);
    @Named("ActorMapper.toEntity")
    public ActorEntity toEntity(ActorDto dto);
    @Named("ActorMapper.toEntityIgnoredId")
    @Mapping(target = "idActor", ignore = true)
    public ActorEntity toEntityIgnoredId(ActorDto dto);
    @Named("ActorMapper.toListDtos")
    Collection<ActorDto> toListDtos(Collection<ActorEntity> listEntities);
    @Named("ActorMapper.toListEntities")
    Collection<ActorEntity> toListEntities(Collection<ActorDto> listDtos);
    @Named("ActorMapper.updateEntityFromDto")
    void updateEntityFromDto(ActorDto dto, @MappingTarget ActorEntity entity);
    @Named("ActorMapper.updateEntityFromDtoIgnoredId")
    @Mapping(target = "idActor", ignore = true)
    void updateEntityFromDtoIgnoredId(ActorDto dto, @MappingTarget ActorEntity entity);

}