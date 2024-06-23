package com.saksa.utils.dto;

import lombok.*;
import java.time.LocalDate;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDto {

    private Integer idDirector;
    private String name;
    private LocalDate birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectorDto that = (DirectorDto) o;
        return Objects.equals(idDirector, that.idDirector) && Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

}