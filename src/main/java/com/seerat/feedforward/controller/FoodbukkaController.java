package com.seerat.feedforward.controller;

import com.seerat.feedforward.Model;
import com.seerat.feedforward.Service.FoodbukkaService;
import com.seerat.feedforward.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodbukkaController {

    @Autowired
    private FoodbukkaService foodbukkaService;

    @GetMapping("/menu")
    public Mono<String> getMenu() {
        return foodbukkaService.getMenu();
    }

    @GetMapping("/restaurant/{id}")
    public Mono<String> getRestaurant(@PathVariable("id") String restaurantId) {
        return foodbukkaService.getRestaurant(restaurantId);
    }

    @GetMapping("/restaurants")
    public Mono<String> getRestaurants() {
        return foodbukkaService.getRestaurants();
    }

    @GetMapping("/categories")
    public Mono<String> getCategories() {
        return foodbukkaService.getCategories();
    }

    @GetMapping("/category/{id}")
    public Mono<String> getCategory(@PathVariable("id") String categoryId) {
        return foodbukkaService.getCategory(categoryId);
    }

    public static class Controller {
        @RestController
        @RequestMapping("/volunteers")
        public static class VolunteerController {
            @Autowired
            private VolunteerService volunteerService;

            @GetMapping
            public List<Model.Volunteer> getAllVolunteers() {
                return volunteerService.getAllVolunteers();
            }

            @GetMapping("/{id}")
            public Model.Volunteer getVolunteerById(@PathVariable int id) {
                return volunteerService.getVolunteerById(id);
            }

            @PostMapping
            public Model.Volunteer createVolunteer(@RequestBody Model.Volunteer volunteer) {
                return volunteerService.createVolunteer(volunteer);
            }

            @PutMapping("/{id}")
            public Model.Volunteer updateVolunteer(@PathVariable int id, @RequestBody Model.Volunteer volunteer) {
                return volunteerService.updateVolunteer(id, volunteer);
            }

            @DeleteMapping("/{id}")
            public void deleteVolunteer(@PathVariable int id) {
                volunteerService.deleteVolunteer(id);
            }
        }

        @RestController
        @RequestMapping("/providers")
        public static class ProviderController {
            @Autowired
            private Service.ProviderService providerService;

            @GetMapping
            public List<Model.Provider> getAllProviders() {
                return providerService.getAllProviders();
            }

            @GetMapping("/{id}")
            public Model.Provider getProviderById(@PathVariable int id) {
                return providerService.getProviderById(id);
            }

            @PostMapping
            public Model.Provider createProvider(@RequestBody Model.Provider provider) {
                return providerService.createProvider(provider);
            }

            @PutMapping("/{id}")
            public Model.Provider updateProvider(@PathVariable int id, @RequestBody Model.Provider provider) {
                return providerService.updateProvider(id, provider);
            }

            @DeleteMapping("/{id}")
            public void deleteProvider(@PathVariable int id) {
                providerService.deleteProvider(id);
            }
        }

        @RestController
        @RequestMapping("/fooditems")
        public static class FoodItemController {
            @Autowired
            private Service.FoodItemService foodItemService;

            @GetMapping
            public List<Model.FoodItem> getAllFoodItems() {
                return foodItemService.getAllFoodItems();
            }

            @GetMapping("/{id}")
            public Model.FoodItem getFoodItemById(@PathVariable int id) {
                return foodItemService.getFoodItemById(id);
            }

            @PostMapping
            public Model.FoodItem createFoodItem(@RequestBody Model.FoodItem foodItem) {
                return foodItemService.createFoodItem(foodItem);
            }

            @PutMapping("/{id}")
            public Model.FoodItem updateFoodItem(@PathVariable int id, @RequestBody Model.FoodItem foodItem) {
                return foodItemService.updateFoodItem(id, foodItem);
            }

            @DeleteMapping("/{id}")
            public void deleteFoodItem(@PathVariable int id) {
                foodItemService.deleteFoodItem(id);
            }
        }
    }
}
