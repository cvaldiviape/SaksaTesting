package com.saksa.service;

import com.saksa.dto.DirectorDto;
import java.util.List;

public interface DirectorService {
    public List<DirectorDto> getAll();
    public DirectorDto getById(Integer id);
    public DirectorDto create(DirectorDto directorDto);
    public DirectorDto update(DirectorDto directorDto, Integer id);
    public void delete(Integer id);
}
