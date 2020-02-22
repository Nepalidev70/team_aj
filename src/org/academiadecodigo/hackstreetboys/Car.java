package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Car {
    Color color;

    public void buildCar(Color color) {
        this.color = color;
        Rectangle car = new Rectangle(10, 320, 20, 10);
        car.setColor(color);
        car.fill();
    }

   // public void moveRight() { car.translate(10, 0); }
  //  public void moveLeft() {car.translate(0, 10);}









}