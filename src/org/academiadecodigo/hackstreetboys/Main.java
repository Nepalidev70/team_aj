package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.controls.CarControls;
import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.hackstreetboys.grid.TrackOne;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.io.File;

public class Main {
    public static void main(String[] args) {

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
    }

}
