package com.example.catapi;

import com.example.catapi.data.controller.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class CatApiApplication{
    public static void main(String[] args) {
        SpringApplication.run(CatApiApplication.class, args);
    }
}
