package com.saksa.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studies")
public class StudioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_studio")
    private Integer idStudio;
    @Column(name = "name", nullable = true)
    private String name;
    @Column(name = "phone", nullable = true, unique = true)
    private String phone;
    @Column(name = "web_page", nullable = true, unique = true)
    private String webPage;

}