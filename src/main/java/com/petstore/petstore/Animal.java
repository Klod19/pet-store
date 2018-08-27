package com.petstore.petstore;


//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class Animal {

//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    public long id;

    public String race;

    public String name;

    public int age;

    public String fur_colour;

    public String eye_colour;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getRace() {
        System.out.println(race);
        return race;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public String getFur_colour() {
        System.out.println(fur_colour);
        return fur_colour;
    }

    public String getEye_colour() {
        System.out.println(eye_colour);
        return eye_colour;
    }

    public void eat(){
        System.out.println(this.name + " " + "is eating");
    }

    Timer timer;

    //LOOK INTO timer.schedule(task,delay,period)

    public void play(){
        // creating timer task, timer
//        TimerTask tasknew = new TimerTask();
        timer = new Timer();

        Cat_play cat_play = new Cat_play(this.getName());

        Dog_play dog_play = new Dog_play(this.getName());

        // scheduling the task at fixed rate delay; change according to pet
        if(this.getRace() == "Cat"){
            timer.scheduleAtFixedRate(cat_play ,500,1000);
        }

        if(this.getRace() == "Dog"){
            timer.scheduleAtFixedRate(dog_play, 500, 5000);
        }
    }


    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }


//    public void action(int seconds){
//        timer = new Timer();
//
//        timer.schedule(this.play(), seconds*120);
//    }





    // this method performs the task

//    public void run() {
//        System.out.println("working at fixed rate delay");
//    }
}



//    public void action (int seconds) {
//        timer = new Timer();
//        timer.schedule(new RemindTask(), seconds * 1000);
//    }
//
//    class RemindTask extends TimerTask {
//        public void run() {
//            System.out.println("Time's up!");
//        }
//    }










