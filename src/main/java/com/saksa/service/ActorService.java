package com.saksa.service;

import com.saksa.utils.dto.ActorDto;
import java.util.List;

public interface ActorService {
    public List<ActorDto> getAll();
    public ActorDto getById(Integer id);
    public ActorDto create(ActorDto actorDto);
    public ActorDto update(ActorDto actorDto, Integer id);
    public void delete(Integer id);
}