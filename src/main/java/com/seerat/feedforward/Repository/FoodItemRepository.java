package com.seerat.feedforward.Repository;

import com.seerat.feedforward.Model.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends MongoRepository<FoodItem, Integer> {
    // Basic CRUD methods are inherited from MongoRepository
}
