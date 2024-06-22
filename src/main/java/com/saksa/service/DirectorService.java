package com.saksa.service;

import com.saksa.entity.DirectorEntity;
import java.util.Set;

public interface DirectorService {
    public Set<DirectorEntity> getAll();
    public DirectorEntity getById(Integer id);
    public DirectorEntity create(DirectorEntity director);
    public DirectorEntity update(DirectorEntity director, Integer id);
    public void delete(Integer id);
}
