package com.saksa.controller;

import com.saksa.utils.dto.StudioDto;
import com.saksa.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/studios")
public class StudioController {

    @Autowired
    private StudioService studioService;

    @GetMapping
    public ResponseEntity<List<StudioDto>> getAll() {
        List<StudioDto> listActors = this.studioService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudioDto> getById(@PathVariable Integer id) {
        StudioDto studio = this.studioService.getById(id);
        return ResponseEntity.ok(studio);
    }

    @PostMapping
    public ResponseEntity<StudioDto> create(@RequestBody StudioDto studioDto) {
        StudioDto studio = this.studioService.create(studioDto);
        return ResponseEntity.ok(studio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudioDto> update(@RequestBody StudioDto studioDto, @PathVariable Integer id) {
        StudioDto studio = this.studioService.update(studioDto, id);
        return ResponseEntity.ok(studio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.studioService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}