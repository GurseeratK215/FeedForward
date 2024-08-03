package com.seerat.feedforward.Repository;

import com.seerat.feedforward.Model.Volunteer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends MongoRepository<Volunteer, Integer> {
    // Basic CRUD methods are inherited from MongoRepository
}
