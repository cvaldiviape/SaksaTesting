package com.saksa.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "directors")
public class DirectorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_director")
    private Integer idDirector;
    @Column(name = "name", nullable = true)
    private String name;
    @Column(name = "birthday", nullable = true)
    private LocalDate birthday;
    @OneToOne
    @JoinColumn(name = "id_movie")
    private MovieEntity movie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectorEntity director = (DirectorEntity) o;
        return Objects.equals(idDirector, director.idDirector) && Objects.equals(name, director.name) && Objects.equals(birthday, director.birthday) && Objects.equals(movie, director.movie);
    }

}