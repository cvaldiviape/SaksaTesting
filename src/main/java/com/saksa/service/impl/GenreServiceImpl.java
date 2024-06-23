package com.saksa.service.impl;

import com.saksa.dto.GenreDto;
import com.saksa.entity.GenreEntity;
import com.saksa.repository.GenreRespository;
import com.saksa.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRespository genreRespository;

    @Override
    public List<GenreDto> getAll() {
        return null;
    }

    @Override
    public GenreDto getById(Integer id) {
        return null;
    }

    @Override
    public GenreDto create(GenreDto genreDto) {
        return null;
    }

    @Override
    public GenreDto update(GenreDto genreDto, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
