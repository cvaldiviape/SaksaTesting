package com.saksa.service;

import com.saksa.dto.MovieDto;
import java.util.List;

public interface MovieService {
    public List<MovieDto> getAll();
    public MovieDto getById(Integer id);
    public MovieDto create(MovieDto movieDto);
    public MovieDto update(MovieDto movieDto, Integer id);
    public void delete(Integer id);
}