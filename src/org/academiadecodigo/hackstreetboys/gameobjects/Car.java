package org.academiadecodigo.hackstreetboys.gameobjects;

import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Car {

    private Picture raceCarPicture;
    private Direction currentDirection;
    private Rectangle collisionDetection;

    public int getX(){return collisionDetection.getX();}

    public int getY(){return collisionDetection.getY();}

    public void buildCar(Direction direction, int xPosition, int yPosition) {
        this.currentDirection = direction;
        setCurrentDirection(direction,xPosition,yPosition);
        this.raceCarPicture.draw();
        makeFrontBumper(xPosition,yPosition);
    }

    private void makeFrontBumper(int xPosition, int yPosition){
        this.collisionDetection = new Rectangle((double)xPosition + 10,(double)yPosition,10,10);
        this.collisionDetection.setColor(Color.BLACK);
        this.collisionDetection.draw();
    }

    public void setCurrentDirection(Direction newDirection,int xPosition, int yPosition){
        switch (newDirection){
            case E:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarE.png");
                break;
            case SE:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarSE.png");
                break;
            case S:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarS.png");
                break;
            case SW:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarSW.png");
                break;
            case W:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarW.png");
                break;
            case NW:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarNW.png");
                break;
            case N:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarN.png");
                break;
            case NE:
                this.raceCarPicture = new Picture(xPosition,yPosition,"resources/smallCarNE.png");
                break;
        }
    }

    //testing purposes methods

    public void moveLeft() {
        this.raceCarPicture.translate(-10, 00);
    }

    public void moveRight() {
        this.raceCarPicture.translate(10, 0);
    }










}