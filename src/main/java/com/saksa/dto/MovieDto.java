package com.saksa.dto;

import com.saksa.entity.ActorEntity;
import com.saksa.entity.DirectorEntity;
import com.saksa.entity.GenreEntity;
import com.saksa.entity.StudioEntity;
import lombok.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Integer idMovie;
    private String synopsis;
    private Integer year;
    private DirectorEntity director;
    private Set<ActorEntity> listActors = new HashSet<>();
    private StudioEntity studio;
    private Set<GenreEntity> listGenres = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieDto movieDto = (MovieDto) o;
        return Objects.equals(idMovie, movieDto.idMovie) && Objects.equals(synopsis, movieDto.synopsis) && Objects.equals(year, movieDto.year) && Objects.equals(director, movieDto.director) && Objects.equals(listActors, movieDto.listActors) && Objects.equals(studio, movieDto.studio) && Objects.equals(listGenres, movieDto.listGenres);
    }

}