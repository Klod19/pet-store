package com.petstore.petstore;

public class Dog extends Animal {

    private String dog_type;

    public Dog () {} //empty constructor for JACKSON

    public Dog (String name,  int age, String fur_colour, String eye_colour, String dog_type){

        this.name = name;

        this.race = "Dog";

        this.age = age;

        this.fur_colour = fur_colour;

        this.eye_colour = eye_colour;

        this.dog_type = dog_type;
    }



    public String get_cat_type() {
        System.out.println(this.dog_type);
        return dog_type;
    }
}
