package com.saksa.controller;

import com.saksa.dto.GenreDto;
import com.saksa.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/genres")
public class GenreController {
    
    @Autowired
    private GenreService genreService;

    @GetMapping
    public ResponseEntity<List<GenreDto>> getAll() {
        List<GenreDto> listActors = this.genreService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreDto> getById(@PathVariable Integer id) {
        GenreDto genre = this.genreService.getById(id);
        return ResponseEntity.ok(genre);
    }

    @PostMapping
    public ResponseEntity<GenreDto> create(@RequestBody GenreDto genreDto) {
        GenreDto genre = this.genreService.create(genreDto);
        return ResponseEntity.ok(genre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GenreDto> update(@RequestBody GenreDto genreDto, @PathVariable Integer id) {
        GenreDto genre = this.genreService.update(genreDto, id);
        return ResponseEntity.ok(genre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.genreService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}