package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.controls.CarControls;
import org.academiadecodigo.hackstreetboys.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Main {
    public static void main(String[] args) {

        Grid newGrid = new Grid(100, 100);
        newGrid.init(Color.BLACK);
        CarControls carControls = new CarControls();
        Car car1 = new Car();
        car1.buildCar();
        carControls.setCar(car1);
        carControls.init();




        }
}
