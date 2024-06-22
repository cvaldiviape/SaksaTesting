package com.saksa.dto;

import lombok.*;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenreDto {

    private Integer idGenre;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreDto genreDto = (GenreDto) o;
        return Objects.equals(idGenre, genreDto.idGenre) && Objects.equals(name, genreDto.name);
    }

}