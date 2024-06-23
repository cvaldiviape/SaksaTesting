package com.saksa.controller;

import com.saksa.dto.DirectorDto;
import com.saksa.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/directors")
public class DirectorController {
    
    @Autowired
    private DirectorService directorService;

    @GetMapping
    public ResponseEntity<List<DirectorDto>> getAll() {
        List<DirectorDto> listActors = this.directorService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorDto> getById(@PathVariable Integer id) {
        DirectorDto director = this.directorService.getById(id);
        return ResponseEntity.ok(director);
    }

    @PostMapping
    public ResponseEntity<DirectorDto> create(@RequestBody DirectorDto directorDto) {
        DirectorDto director = this.directorService.create(directorDto);
        return ResponseEntity.ok(director);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DirectorDto> update(@RequestBody DirectorDto directorDto, @PathVariable Integer id) {
        DirectorDto director = this.directorService.update(directorDto, id);
        return ResponseEntity.ok(director);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.directorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}