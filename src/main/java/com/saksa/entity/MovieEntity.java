package com.saksa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movies")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie")
    private Integer idMovie;
    @Column(name = "synopsis", nullable = false)
    private String synopsis;
    @Column(name = "year", nullable = false)
    private Integer year;
    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
    private DirectorEntity director;
    @Builder.Default
    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<ActorEntity> listActors = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "id_studio")
    private StudioEntity studio;
    @Builder.Default
    @ManyToMany
    @JoinTable(name = "movies_genres",
            joinColumns = @JoinColumn(name = "id_movie", referencedColumnName = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_genre", referencedColumnName = "id_genre"))
    private Set<GenreEntity> listGenres = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity movie = (MovieEntity) o;
        return Objects.equals(idMovie, movie.idMovie) && Objects.equals(synopsis, movie.synopsis) && Objects.equals(year, movie.year) && Objects.equals(director, movie.director) && Objects.equals(listActors, movie.listActors) && Objects.equals(studio, movie.studio) && Objects.equals(listGenres, movie.listGenres);
    }

}