package com.saksa.service;

import com.saksa.entity.StudioEntity;
import java.util.Set;

public interface StudioService {
    public Set<StudioEntity> getAll();
    public StudioEntity getById(Integer id);
    public StudioEntity create(StudioEntity studio);
    public StudioEntity update(StudioEntity studio, Integer id);
    public void delete(Integer id);
}