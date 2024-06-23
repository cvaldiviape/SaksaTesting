package com.saksa.controller;

import com.saksa.dto.MovieDto;
import com.saksa.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        List<MovieDto> listActors = this.movieService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable Integer id) {
        MovieDto movie = this.movieService.getById(id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<MovieDto> create(@RequestBody MovieDto movieDto) {
        MovieDto movie = this.movieService.create(movieDto);
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> update(@RequestBody MovieDto movieDto, @PathVariable Integer id) {
        MovieDto movie = this.movieService.update(movieDto, id);
        return ResponseEntity.ok(movie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.movieService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}