package org.academiadecodigo.hackstreetboys.gameobjects;

import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Car {

    private Picture raceCarPicture;
    private Direction currentDirection;


    public void buildCar(Direction direction, int xPosition, int yPosition) {
        this.currentDirection = direction;
        this.raceCarPicture = new Picture(xPosition, yPosition, "resources/smallRacecar.jpg");
        this.raceCarPicture.draw();
    }

    //testing purposes methods

    public void moveLeft() {
        this.raceCarPicture.translate(-10, 00);
    }

    public void moveRight() {
        this.raceCarPicture.translate(10, 0);
    }










}