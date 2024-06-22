package com.saksa.controller;

import com.saksa.entity.GenreEntity;
import com.saksa.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("api/genres")
public class GenreController {
    
    @Autowired
    private GenreService genreService;

    @GetMapping
    public ResponseEntity<Set<GenreEntity>> getAll() {
        Set<GenreEntity> listActors = this.genreService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreEntity> getById(@PathVariable Integer id) {
        GenreEntity genre = this.genreService.getById(id);
        return ResponseEntity.ok(genre);
    }

    @PostMapping
    public ResponseEntity<GenreEntity> create(@RequestBody GenreEntity genreEntity) {
        GenreEntity genre = this.genreService.create(genreEntity);
        return ResponseEntity.ok(genre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenreEntity> update(@RequestBody GenreEntity genreEntity, @PathVariable Integer id) {
        GenreEntity genre = this.genreService.update(genreEntity, id);
        return ResponseEntity.ok(genre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.genreService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}