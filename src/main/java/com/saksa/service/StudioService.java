package com.saksa.service;

import com.saksa.entity.StudioEntity;
import java.util.List;

public interface StudioService {
    public List<StudioEntity> getAll();
    public StudioEntity getById(Integer id);
    public StudioEntity create(StudioEntity studio);
    public StudioEntity update(StudioEntity studio, Integer id);
    public void delete(Integer id);
}