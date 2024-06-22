package com.saksa.controller;

import com.saksa.entity.DirectorEntity;
import com.saksa.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("api/directors")
public class DirectorController {
    
    @Autowired
    private DirectorService directorService;

    @GetMapping
    public ResponseEntity<Set<DirectorEntity>> getAll() {
        Set<DirectorEntity> listActors = this.directorService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorEntity> getById(@PathVariable Integer id) {
        DirectorEntity director = this.directorService.getById(id);
        return ResponseEntity.ok(director);
    }

    @PostMapping
    public ResponseEntity<DirectorEntity> create(@RequestBody DirectorEntity directorEntity) {
        DirectorEntity director = this.directorService.create(directorEntity);
        return ResponseEntity.ok(director);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DirectorEntity> update(@RequestBody DirectorEntity directorEntity, @PathVariable Integer id) {
        DirectorEntity director = this.directorService.update(directorEntity, id);
        return ResponseEntity.ok(director);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.directorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}