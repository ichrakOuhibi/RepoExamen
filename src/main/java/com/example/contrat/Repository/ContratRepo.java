package com.example.contrat.Repository;

import com.example.contrat.Entities.Contrat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContratRepo extends MongoRepository<Contrat,String> {
}
