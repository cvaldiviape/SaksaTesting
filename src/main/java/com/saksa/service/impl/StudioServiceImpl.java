package com.saksa.service.impl;

import com.saksa.utils.dto.StudioDto;
import com.saksa.repository.StudioRepository;
import com.saksa.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudioServiceImpl implements StudioService {

    @Autowired
    private StudioRepository studioRepository;

    @Override
    public List<StudioDto> getAll() {
        return null;
    }

    @Override
    public StudioDto getById(Integer id) {
        return null;
    }

    @Override
    public StudioDto create(StudioDto studioDto) {
        return null;
    }

    @Override
    public StudioDto update(StudioDto studioDto, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
