package com.saksa.dto;

import com.saksa.utils.Sex;
import lombok.*;

import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {

    private Integer idActor;
    private String name;
    private Sex sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorDto actorDto = (ActorDto) o;
        return Objects.equals(idActor, actorDto.idActor) && Objects.equals(name, actorDto.name) && sex == actorDto.sex;
    }

}