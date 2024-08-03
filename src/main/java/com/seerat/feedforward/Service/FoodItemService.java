package com.seerat.feedforward.Service;

import com.seerat.feedforward.Model.FoodItem;
import com.seerat.feedforward.Repository.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    public FoodItem getFoodItemById(int id) {
        Optional<FoodItem> foodItem = foodItemRepository.findById(id);
        return foodItem.orElse(null);
    }

    public FoodItem createFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public FoodItem updateFoodItem(int id, FoodItem foodItem) {
        if (foodItemRepository.existsById(id)) {
            foodItem.setItemId(id);
            return foodItemRepository.save(foodItem);
        } else {
            return null;
        }
    }

    public void deleteFoodItem(int id) {
        if (foodItemRepository.existsById(id)) {
            foodItemRepository.deleteById(id);
        }
    }
}
