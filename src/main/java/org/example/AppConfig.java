package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CatFeeding feedCat(){
        return new CatFeeding();
    }
    @Bean
    public DogFeeding feedDog(){
        return new DogFeeding();
    }
    @Bean
    public ReadingNews read(){
        return new ReadingNews();
    }
    @Bean
    public String message(){
        return "The news has bean read";
    }
}
