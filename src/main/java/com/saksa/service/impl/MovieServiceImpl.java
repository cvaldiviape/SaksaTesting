package com.saksa.service.impl;

import com.saksa.utils.dto.MovieDto;
import com.saksa.repository.MovieRepository;
import com.saksa.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAll() {
        return null;
    }

    @Override
    public MovieDto getById(Integer id) {
        return null;
    }

    @Override
    public MovieDto create(MovieDto movieDto) {
        return null;
    }

    @Override
    public MovieDto update(MovieDto movieDto, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
