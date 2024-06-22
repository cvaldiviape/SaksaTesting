package com.saksa.controller;

import com.saksa.entity.ActorEntity;
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
    public ResponseEntity<List<ActorEntity>> getAll() {
        List<ActorEntity> listActors = this.actorService.getAll();
        return ResponseEntity.ok(listActors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActorEntity> getById(@PathVariable Integer id) {
        ActorEntity actor = this.actorService.getById(id);
        return ResponseEntity.ok(actor);
    }

    @PostMapping
    public ResponseEntity<ActorEntity> create(@RequestBody ActorEntity actorEntity) {
        ActorEntity actor = this.actorService.create(actorEntity);
        return ResponseEntity.ok(actor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ActorEntity> update(@RequestBody ActorEntity actorEntity, @PathVariable Integer id) {
        ActorEntity actor = this.actorService.update(actorEntity, id);
        return ResponseEntity.ok(actor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        this.actorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}