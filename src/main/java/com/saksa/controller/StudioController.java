package com.saksa.controller;

import com.saksa.entity.StudioEntity;
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
    public ResponseEntity<List<StudioEntity>> getAll() {
        List<StudioEntity> listActors = this.studioService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudioEntity> getById(@PathVariable Integer id) {
        StudioEntity studio = this.studioService.getById(id);
        return ResponseEntity.ok(studio);
    }

    @PostMapping
    public ResponseEntity<StudioEntity> create(@RequestBody StudioEntity studioEntity) {
        StudioEntity studio = this.studioService.create(studioEntity);
        return ResponseEntity.ok(studio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudioEntity> update(@RequestBody StudioEntity studioEntity, @PathVariable Integer id) {
        StudioEntity studio = this.studioService.update(studioEntity, id);
        return ResponseEntity.ok(studio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.studioService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}