package com.example.catapi.data.controller;

import com.example.catapi.data.controller.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public CatController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/cats")
    public List<Cat> listCats(){
        String sql = "SELECT * FROM Cat";

        List<Cat> cats = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Cat.class));

        return cats;
    }
    @GetMapping("/cats/{id}")
    public List<Cat> listCat(@PathVariable int id){
        String sql = "SELECT * FROM Cat WHERE ID = "+id;

        List<Cat> cats = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Cat.class));

        return cats;
    }
    @GetMapping("/breeds/{id}")
    public List<Cat> listBreeds(@PathVariable int id){
        String sql = "SELECT * FROM Cat WHERE BreedTypeId = "+id;

        List<Cat> cats = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Cat.class));

        return cats;
    }
}
