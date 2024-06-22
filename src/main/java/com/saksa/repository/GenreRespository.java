package com.saksa.repository;

import com.saksa.entity.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRespository extends JpaRepository<GenreEntity, Integer> {

}