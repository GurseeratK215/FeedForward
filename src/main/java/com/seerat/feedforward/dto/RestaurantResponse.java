package com.seerat.feedforward.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class RestaurantResponse {
    private List<Restaurant> data;

    public static class Restaurant {
        private String restaurant_name;
        @Getter
        @Setter
        private String address;

        public String getRestaurantName() {
            return restaurant_name;
        }

        public void setRestaurantName(String restaurant_name) {
            this.restaurant_name = restaurant_name;
        }

    }
}
