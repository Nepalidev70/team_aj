package org.academiadecodigo.hackstreetboys.gameobjects;

import java.util.Timer;
import java.util.TimerTask;

public class TimerForGame {

    private int secondsElapsed = 40 ;
    private int millisecondsElapsed = 00;
    private int minutesPassed = 00;


    Timer lapTime = new Timer();
    TimerTask task = new TimerTask() {

        @Override
        public void run() {
            millisecondsElapsed++;
            if(millisecondsElapsed >= 999){
                secondsElapsed++;
                millisecondsElapsed=0;
            } if (secondsElapsed >= 60){
                minutesPassed++;
                secondsElapsed=0;
            }
            System.out.println("time elapsed: " + minutesPassed + ":" + secondsElapsed + ":" + millisecondsElapsed);
        }
    };

    public int getSecondsElapsed() {
        return secondsElapsed;
    }

    public void start() {
        lapTime.scheduleAtFixedRate(task, 0, 1);
    }


}
