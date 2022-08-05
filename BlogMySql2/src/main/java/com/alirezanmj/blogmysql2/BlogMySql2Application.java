package com.alirezanmj.blogmysql2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogMySql2Application {


    @Autowired
    BlogRepository blogRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogMySql2Application.class, args);

    }

}
