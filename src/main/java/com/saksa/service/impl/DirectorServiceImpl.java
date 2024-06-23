package com.saksa.service.impl;

import com.saksa.dto.DirectorDto;
import com.saksa.repository.DirectorRepository;
import com.saksa.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public List<DirectorDto> getAll() {
        return null;
    }

    @Override
    public DirectorDto getById(Integer id) {
        return null;
    }

    @Override
    public DirectorDto create(DirectorDto directorDto) {
        return null;
    }

    @Override
    public DirectorDto update(DirectorDto directorDto, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
