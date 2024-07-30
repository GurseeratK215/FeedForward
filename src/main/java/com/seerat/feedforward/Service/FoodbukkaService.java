package com.seerat.feedforward.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FoodbukkaService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    private static final String API_BASE_URL = "https://foodbukka.herokuapp.com/api/v1";

    public Mono<String> getMenu() {
        return webClientBuilder.build()
                .get()
                .uri(API_BASE_URL + "/menu")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getRestaurant(String restaurantId) {
        return webClientBuilder.build()
                .get()
                .uri(API_BASE_URL + "/restaurant/" + restaurantId)
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getRestaurants() {
        return webClientBuilder.build()
                .get()
                .uri(API_BASE_URL + "/restaurant")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getCategories() {
        return webClientBuilder.build()
                .get()
                .uri(API_BASE_URL + "/category")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> getCategory(String categoryId) {
        return webClientBuilder.build()
                .get()
                .uri(API_BASE_URL + "/category/" + categoryId)
                .retrieve()
                .bodyToMono(String.class);
    }
}

