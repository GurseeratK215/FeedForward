package com.seerat.feedforward.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Value("${foodbukka.api.url}")
    private String foodbukkaApiUrl;

    @Value("${foodbukka.api.key}")
    private String foodbukkaApiKey;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(foodbukkaApiUrl)
                .defaultHeader("api-key", foodbukkaApiKey)
                .build();
    }
}
