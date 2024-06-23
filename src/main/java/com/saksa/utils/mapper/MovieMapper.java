package com.saksa.utils.mapper;

import com.saksa.entity.MovieEntity;
import com.saksa.utils.dto.MovieDto;
import org.mapstruct.*;
import java.util.Collection;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MovieMapper {

    @Named("MovieMapper.toDto")
    public MovieDto toDto(MovieEntity entity);
    @Named("MovieMapper.toEntity")
    public MovieEntity toEntity(MovieDto dto);
    @Named("MovieMapper.toEntityIgnoredId")
    @Mapping(target = "idMovie", ignore = true)
    public MovieEntity toEntityIgnoredId(MovieDto dto);
    @Named("MovieMapper.toListDtos")
    Collection<MovieDto> toListDtos(Collection<MovieEntity> listEntities);
    @Named("MovieMapper.toListEntities")
    Collection<MovieEntity> toListEntities(Collection<MovieDto> listDtos);
    @Named("MovieMapper.updateEntityFromDto")
    void updateEntityFromDto(MovieDto dto, @MappingTarget MovieEntity entity);
    @Named("MovieMapper.updateEntityFromDtoIgnoredId")
    @Mapping(target = "idMovie", ignore = true)
    void updateEntityFromDtoIgnoredId(MovieDto dto, @MappingTarget MovieEntity entity);
    
}