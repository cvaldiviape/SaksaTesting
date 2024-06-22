package com.saksa.service;

import com.saksa.entity.MovieEntity;
import java.util.List;

public interface MovieService {
    public List<MovieEntity> getAll();
    public MovieEntity getById(Integer id);
    public MovieEntity create(MovieEntity movie);
    public MovieEntity update(MovieEntity movie, Integer id);
    public void delete(Integer id);
}