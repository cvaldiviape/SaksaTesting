package com.saksa.service;

import com.saksa.dto.GenreDto;
import java.util.List;

public interface GenreService {
    public List<GenreDto> getAll();
    public GenreDto getById(Integer id);
    public GenreDto create(GenreDto genreDto);
    public GenreDto update(GenreDto genreDto, Integer id);
    public void delete(Integer id);
}