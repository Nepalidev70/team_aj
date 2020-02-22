package org.academiadecodigo.hackstreetboys.gameobjects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Car {
    private Picture raceCarPicture;

    public void buildCar() {
        this.raceCarPicture = new Picture(10, 320, "resources/smallRacecar.jpg");
        this.raceCarPicture.draw();
    }

    public void moveLeft() {
        this.raceCarPicture.translate(-10, 00);
    }

    public void moveRight() {
        this.raceCarPicture.translate(10, 0);
    }










}