package com.alirezanmj.h2blog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2BlogApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(BlogRepository repository) {
        return (args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
        });
    }
    private void insertJavaAdvocates(BlogRepository repository){
        repository.save(new Blog("my blog","welcome to my blog."));
        repository.save(new Blog("blog Barney","welcome to barney blog."));
        repository.save(new Blog("Ted Blog","welcome to ted blog."));
        repository.save(new Blog("TBag Blog","welcome to TBag blog."));

    }
}
