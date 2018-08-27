package com.petstore.petstore;

import java.util.Date;
import java.util.TimerTask;

public class Dog_play extends TimerTask {
    Date date = new Date();

    public String name;

    Dog_play(String name){
        this.name = name;
    }

    public void run() {
        System.out.println(name + " says: " + "Bark!!");
    }
}