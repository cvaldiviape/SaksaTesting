package com.saksa.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudioEntity studio = (StudioEntity) o;
        return Objects.equals(idStudio, studio.idStudio) && Objects.equals(name, studio.name) && Objects.equals(phone, studio.phone) && Objects.equals(webPage, studio.webPage);
    }

}