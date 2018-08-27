package com.petstore.petstore;

import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

public class Action {

    Timer timer;

    public Action(int seconds) {
        timer = new Timer();
        timer.schedule(new play(), seconds*120);
    }

    class play extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }
}
