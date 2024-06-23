package com.saksa.controller;

import com.saksa.utils.dto.ActorDto;
import com.saksa.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public ResponseEntity<List<ActorDto>> getAll() {
        List<ActorDto> listActors = this.actorService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorDto> getById(@PathVariable Integer id) {
        ActorDto actor = this.actorService.getById(id);
        return ResponseEntity.ok(actor);
    }

    @PostMapping
    public ResponseEntity<ActorDto> create(@RequestBody ActorDto actorEntity) {
        ActorDto actor = this.actorService.create(actorEntity);
        return ResponseEntity.ok(actor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ActorDto> update(@RequestBody ActorDto actorEntity, @PathVariable Integer id) {
        ActorDto actor = this.actorService.update(actorEntity, id);
        return ResponseEntity.ok(actor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.actorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}