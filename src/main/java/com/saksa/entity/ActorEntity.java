package com.saksa.entity;

import com.saksa.utils.Sex;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

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

}