package com.saksa.utils.mapper;

import com.saksa.entity.DirectorEntity;
import com.saksa.utils.dto.DirectorDto;
import org.mapstruct.*;
import java.util.Collection;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DirectorMapper {

    @Named("DirectorMapper.toDto")
    public DirectorDto toDto(DirectorEntity entity);
    @Named("DirectorMapper.toEntity")
    public DirectorEntity toEntity(DirectorDto dto);
    @Named("DirectorMapper.toEntityIgnoredId")
    @Mapping(target = "idDirector", ignore = true)
    public DirectorEntity toEntityIgnoredId(DirectorDto dto);
    @Named("DirectorMapper.toListDtos")
    Collection<DirectorDto> toListDtos(Collection<DirectorEntity> listEntities);
    @Named("DirectorMapper.toListEntities")
    Collection<DirectorEntity> toListEntities(Collection<DirectorDto> listDtos);
    @Named("DirectorMapper.updateEntityFromDto")
    void updateEntityFromDto(DirectorDto dto, @MappingTarget DirectorEntity entity);
    @Named("DirectorMapper.updateEntityFromDtoIgnoredId")
    @Mapping(target = "idDirector", ignore = true)
    void updateEntityFromDtoIgnoredId(DirectorDto dto, @MappingTarget DirectorEntity entity);
    
}