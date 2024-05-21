package com.abdo.recommandationms.Repositories;

import com.abdo.recommandationms.Entities.Recommandation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommandationRepository extends MongoRepository<Recommandation, String> {

}
