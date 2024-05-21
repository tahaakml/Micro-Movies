package com.Micromovies.recommendation.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Micromovies.recommendation.entities.Recommandation;

@Repository
public interface RecommandationRepository extends MongoRepository<Recommandation, String> {

}
