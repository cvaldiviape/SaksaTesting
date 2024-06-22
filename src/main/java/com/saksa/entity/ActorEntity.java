package com.saksa.entity;

import com.saksa.utils.Sex;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actors")
public class ActorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actor")
    private Integer idActor;
    @Column(name = "name", nullable = true)
    private String name;
    @Column(name = "sex", nullable = true)
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @ManyToOne
    @JoinColumn(name="id_movie")
    private MovieEntity movie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorEntity that = (ActorEntity) o;
        return Objects.equals(idActor, that.idActor) && Objects.equals(name, that.name) && sex == that.sex && Objects.equals(movie, that.movie);
    }

}