package com.saksa.service.impl;

import com.saksa.dto.ActorDto;
import com.saksa.repository.ActorRepository;
import com.saksa.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public List<ActorDto> getAll() {
        return null;
    }

    @Override
    public ActorDto getById(Integer id) {
        return null;
    }

    @Override
    public ActorDto create(ActorDto actorDto) {
        return null;
    }

    @Override
    public ActorDto update(ActorDto actorDto, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
