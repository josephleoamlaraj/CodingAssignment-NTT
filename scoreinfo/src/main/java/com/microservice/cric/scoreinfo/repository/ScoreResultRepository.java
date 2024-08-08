package com.microservice.cric.scoreinfo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.cric.scoreinfo.entity.ScoreResult;

// Annotation
@Repository

// Interface extending CrudRepository
public interface ScoreResultRepository
    extends CrudRepository<ScoreResult, Integer> {
}
