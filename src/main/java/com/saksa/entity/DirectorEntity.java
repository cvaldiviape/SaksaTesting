package com.saksa.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

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

}