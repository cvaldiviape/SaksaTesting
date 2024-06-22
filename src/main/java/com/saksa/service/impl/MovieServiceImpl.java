package com.saksa.service.impl;

import com.saksa.entity.MovieEntity;
import com.saksa.repository.MovieRepository;
import com.saksa.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Set<MovieEntity> getAll() {
        return null;
    }

    @Override
    public MovieEntity getById(Integer id) {
        return null;
    }

    @Override
    public MovieEntity create(MovieEntity movie) {
        return null;
    }

    @Override
    public MovieEntity update(MovieEntity movie, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
