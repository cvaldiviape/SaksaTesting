package com.saksa.service.impl;

import com.saksa.entity.ActorEntity;
import com.saksa.repository.ActorRepository;
import com.saksa.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Set<ActorEntity> getAll() {
        return null;
    }

    @Override
    public ActorEntity getById(Integer id) {
        return null;
    }

    @Override
    public ActorEntity create(ActorEntity actor) {
        return null;
    }

    @Override
    public ActorEntity update(ActorEntity actor, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
