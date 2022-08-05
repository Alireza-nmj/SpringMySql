package com.mysql.blogmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BlogMySqlApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(BlogMySqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        String sql = "INSERT INTO blog (id, title, content) VALUES (?, ?, ?)";

        int result = jdbcTemplate.update(sql, 5,"rabinBlog", "welcome to rabin blog.");


        if (result > 0) {
        System.out.println("A new row has been inserted.");
        }
    }
}
