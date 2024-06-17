package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PetFeeding {
    @Configuration
    public static class CatFeeding{
        @Bean ("cat")
        public void feedCat() {
            System.out.println("The cat is fed");
        }

    }
    @Configuration
    public static class DogFeeding{
        @Bean ("dog")
        public void feedDog() {
            System.out.println("The dog is fed");
        }
    }
}
