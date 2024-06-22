package com.saksa.repository;

import com.saksa.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Integer, ActorEntity> {

}
