package com.saksa.utils.dto;

import lombok.*;
import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudioDto {

    private Integer idStudio;
    private String name;
    private String phone;
    private String webPage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudioDto studioDto = (StudioDto) o;
        return Objects.equals(idStudio, studioDto.idStudio) && Objects.equals(name, studioDto.name) && Objects.equals(phone, studioDto.phone) && Objects.equals(webPage, studioDto.webPage);
    }

}