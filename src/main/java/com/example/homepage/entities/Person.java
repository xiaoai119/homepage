package com.example.homepage.entities;

/**
 * Created By xfj on 2018/11/16
 */
public class Person {

    private String name;
    private Integer id;


    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
