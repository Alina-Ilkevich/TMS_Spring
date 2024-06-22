package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigFile {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CatFeeding cat = context.getBean("feedCat", CatFeeding.class);
        cat.feedCat();
        DogFeeding dog = context.getBean("feedDog", DogFeeding.class);
        dog.feedDog();
        ReadingNews news = context.getBean("read", ReadingNews.class);
        String message = context.getBean("message", String.class);
        news.getMessage();
    }
}
