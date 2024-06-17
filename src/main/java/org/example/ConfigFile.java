package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigFile {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
        ReadingNews bean = (ReadingNews) context1.getBean("read");
        bean.getMessage();
        ApplicationContext context = new AnnotationConfigApplicationContext(PetFeeding.class);
        //PetFeeding cat = context.getBean("cat", PetFeeding.class);
        //PetFeeding dog = context.getBean("dog", PetFeeding.class);

    }
}
