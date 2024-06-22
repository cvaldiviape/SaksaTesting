package com.saksa.service.impl;

import com.saksa.entity.StudioEntity;
import com.saksa.repository.StudioRepository;
import com.saksa.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class StudioServiceImpl implements StudioService {

    @Autowired
    private StudioRepository studioRepository;

    @Override
    public Set<StudioEntity> getAll() {
        return null;
    }

    @Override
    public StudioEntity getById(Integer id) {
        return null;
    }

    @Override
    public StudioEntity create(StudioEntity studio) {
        return null;
    }

    @Override
    public StudioEntity update(StudioEntity studio, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
