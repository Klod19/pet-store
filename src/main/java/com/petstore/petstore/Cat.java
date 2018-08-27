package com.petstore.petstore;

//import javax.persistence.Id;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;

import java.util.Timer;

//@Entity
public class Cat extends Animal {

    private String cat_type;

    public Cat () {} //empty constructor for JACKSON

    public Cat (String name, int age, String fur_colour, String eye_colour, String cat_type){

        this.name = name;

        this.race = "Cat";

        this.age = age;

        this.fur_colour = fur_colour;

        this.eye_colour = eye_colour;

        this.cat_type = cat_type;
    }



    public String get_cat_type() {
        System.out.println(this.cat_type);
        return cat_type;
    }


}



//    private long id;
//
//    private String name;
//
//    private int age;
//
//    private String fur_color;
//
//    private String eye_color;