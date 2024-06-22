package com.saksa.controller;

import com.saksa.entity.MovieEntity;
import com.saksa.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("api/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Set<MovieEntity>> getAll() {
        Set<MovieEntity> listActors = this.movieService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieEntity> getById(@PathVariable Integer id) {
        MovieEntity movie = this.movieService.getById(id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<MovieEntity> create(@RequestBody MovieEntity movieEntity) {
        MovieEntity movie = this.movieService.create(movieEntity);
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieEntity> update(@RequestBody MovieEntity movieEntity, @PathVariable Integer id) {
        MovieEntity movie = this.movieService.update(movieEntity, id);
        return ResponseEntity.ok(movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.movieService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}