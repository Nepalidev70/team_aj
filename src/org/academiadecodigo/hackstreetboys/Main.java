package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.hackstreetboys.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Main {
    public static void main(String[] args) {

        Grid newGrid = new Grid(100, 100);
        newGrid.init(Color.BLACK);
        Car car = new Car();
        car.buildCar(Color.BLUE);
    }
}
