package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.controls.CarControls;
import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.hackstreetboys.grid.TrackOne;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Main {
    public static void main(String[] args) {

        Track trackOne = new TrackOne(100, 100);
        trackOne.init(Color.BLACK);
        CarControls carControls = new CarControls();
        Car car1 = new Car();
        car1.buildCar();
        carControls.setCar(car1);
        carControls.init();

    }
}
