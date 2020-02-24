package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.controls.CarControls;
import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.gameobjects.TimerForGame;
import org.academiadecodigo.hackstreetboys.grid.SplashScreen;
import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.hackstreetboys.grid.TrackOne;
import org.academiadecodigo.hackstreetboys.moveLogic.MovementLogic;
import org.academiadecodigo.hackstreetboys.music.JLayer;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.io.File;

public class GameLogic {

    public GameLogic() {

            Track trackOne = new TrackOne(100, 100);
            trackOne.init(Color.BLACK);
            CarControls carControls = new CarControls();
            Car car1 = new Car();
            car1.buildCar(trackOne.getCarStartingDirection(), trackOne.getCarStartX(),trackOne.getCarStartY());

            carControls.setCar(car1);
            carControls.init();

            String path = "resources/mymusic.mp3";
            File mp3File = new File(path);
            JLayer.PlayMp3 music = new JLayer.PlayMp3();
            music.play(mp3File);
            music.start();


            Thread timerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    TimerForGame stopwatch = new TimerForGame();
                    stopwatch.start();
                }
            });
            timerThread.start();

            Thread movementThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int currentSpeed = 200;
                    while (true){
                        try {
                            Thread.sleep(currentSpeed);
                        } catch (InterruptedException e) {}
                        Boolean isMoving = MovementLogic.moveCar(car1,trackOne);
                        if(isMoving && currentSpeed>= 50){
                            currentSpeed -= 7;
                        } else if(!isMoving){
                            currentSpeed = 200;
                        }

                    }
                }
            });
            movementThread.start();
        }
    }

