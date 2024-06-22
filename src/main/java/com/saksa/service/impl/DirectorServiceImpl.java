package com.saksa.service.impl;

import com.saksa.entity.DirectorEntity;
import com.saksa.repository.DirectorRepository;
import com.saksa.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    @Override
    public List<DirectorEntity> getAll() {
        return null;
    }

    @Override
    public DirectorEntity getById(Integer id) {
        return null;
    }

    @Override
    public DirectorEntity create(DirectorEntity director) {
        return null;
    }

    @Override
    public DirectorEntity update(DirectorEntity director, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
