package com.saksa.service;

import com.saksa.entity.GenreEntity;
import java.util.List;

public interface GenreService {
    public List<GenreEntity> getAll();
    public GenreEntity getById(Integer id);
    public GenreEntity create(GenreEntity genre);
    public GenreEntity update(GenreEntity genre, Integer id);
    public void delete(Integer id);
}