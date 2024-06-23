package com.saksa.utils.mapper;

import com.saksa.entity.StudioEntity;
import com.saksa.utils.dto.StudioDto;
import org.mapstruct.*;
import java.util.Collection;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface StudioMapper {

    @Named("StudioMapper.toDto")
    public StudioDto toDto(StudioEntity entity);
    @Named("StudioMapper.toEntity")
    public StudioEntity toEntity(StudioDto dto);
    @Named("StudioMapper.toEntityIgnoredId")
    @Mapping(target = "idStudio", ignore = true)
    public StudioEntity toEntityIgnoredId(StudioDto dto);
    @Named("StudioMapper.toListDtos")
    Collection<StudioDto> toListDtos(Collection<StudioEntity> listEntities);
    @Named("StudioMapper.toListEntities")
    Collection<StudioEntity> toListEntities(Collection<StudioDto> listDtos);
    @Named("StudioMapper.updateEntityFromDto")
    void updateEntityFromDto(StudioDto dto, @MappingTarget StudioEntity entity);
    @Named("StudioMapper.updateEntityFromDtoIgnoredId")
    @Mapping(target = "idStudio", ignore = true)
    void updateEntityFromDtoIgnoredId(StudioDto dto, @MappingTarget StudioEntity entity);
    
}