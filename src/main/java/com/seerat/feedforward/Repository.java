package com.seerat.feedforward;

import java.util.List;

public class Repository {
    @org.springframework.stereotype.Repository
    public  interface VolunteerRepository extends MongoRepository<Model.Volunteer, Integer> {
        List<Model.Volunteer> findAll();

        List<Object> findAll(int id);

        boolean existsById(int id);

        Model.Volunteer save(Model.Volunteer volunteer);

        void deleteById(int id);
    }

    @org.springframework.stereotype.Repository
    public interface ProviderRepository extends MongoRepository<Model.Provider, Integer> {
        List<Model.Provider> findAll();

        List<Object> findById(int id);

        boolean existsById(int id);

        void deleteById(int id);

        Model.Provider save(Model.Provider provider);
    }

    @org.springframework.stereotype.Repository
    public interface FoodItemRepository extends MongoRepository<Model.FoodItem, Integer> {
        List<Model.FoodItem> findAll();

        List<Object> findById(int id);

        boolean existsById(int id);

        void deleteById(int id);

        Model.FoodItem save(Model.FoodItem foodItem);
    }
}
