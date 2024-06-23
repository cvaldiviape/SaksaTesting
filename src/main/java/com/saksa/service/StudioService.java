package com.saksa.service;

import com.saksa.dto.StudioDto;
import java.util.List;

public interface StudioService {
    public List<StudioDto> getAll();
    public StudioDto getById(Integer id);
    public StudioDto create(StudioDto studioDto);
    public StudioDto update(StudioDto studioDto, Integer id);
    public void delete(Integer id);
}