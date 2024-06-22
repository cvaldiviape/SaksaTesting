package com.saksa.service;

import com.saksa.entity.ActorEntity;
import java.util.Set;

public interface ActorService {
    public Set<ActorEntity> getAll();
    public ActorEntity getById(Integer id);
    public ActorEntity create(ActorEntity actor);
    public ActorEntity update(ActorEntity actor, Integer id);
    public void delete(Integer id);
}