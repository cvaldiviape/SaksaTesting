package com.saksa.service.impl;

import com.saksa.entity.GenreEntity;
import com.saksa.repository.GenreRespository;
import com.saksa.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRespository genreRespository;

    @Override
    public Set<GenreEntity> getAll() {
        return null;
    }

    @Override
    public GenreEntity getById(Integer id) {
        return null;
    }

    @Override
    public GenreEntity create(GenreEntity genre) {
        return null;
    }

    @Override
    public GenreEntity update(GenreEntity genre, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
