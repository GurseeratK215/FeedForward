package com.seerat.feedforward.Repository;

import com.seerat.feedforward.Model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends MongoRepository<Provider, Integer> {
    // Basic CRUD methods are inherited from MongoRepository
}
