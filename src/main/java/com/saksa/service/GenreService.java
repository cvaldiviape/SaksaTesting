package com.saksa.service;

import com.saksa.entity.GenreEntity;
import java.util.Set;

public interface GenreService {
    public Set<GenreEntity> getAll();
    public GenreEntity getById(Integer id);
    public GenreEntity create(GenreEntity genre);
    public GenreEntity update(GenreEntity genre, Integer id);
    public void delete(Integer id);
}