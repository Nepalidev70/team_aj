package org.academiadecodigo.hackstreetboys.gameobjects;

import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.hackstreetboys.moveLogic.MovementLogic;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Car {

    private Picture raceCarPicture;
    private Direction currentDirection;
    private Rectangle collisionDetection;

    public int getX(){return collisionDetection.getX();}

    public int getY(){return collisionDetection.getY();}

    public Picture getCarBody(){
        return raceCarPicture;
    }

    public Rectangle getFrontBumper(){
        return collisionDetection;
    }

    public Direction getCurrentDirection(){
        return currentDirection;
    }

    public void buildCar(Direction direction, int xPosition, int yPosition) {
        this.currentDirection = direction;
        makeFrontBumper(xPosition,yPosition);
        setCurrentDirection(direction);
    }

    private void makeFrontBumper(int xPosition, int yPosition){
        this.collisionDetection = new Rectangle((double)xPosition,(double)yPosition,10,10);
        this.collisionDetection.setColor(Color.BLACK);
        this.collisionDetection.draw();
    }

    public void setCurrentDirection(Direction newDirection){
        switch (newDirection){
            case E:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX()-10,getY(),"resources/smallCarE.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case SE:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX()-10,getY()-10,"resources/smallCarSE.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case S:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX(),getY()-10,"resources/smallCarS.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case SW:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX(),getY()-10,"resources/smallCarSW.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case W:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX(),getY(),"resources/smallCarW.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case NW:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX(),getY(),"resources/smallCarNW.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case N:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX(),getY(),"resources/smallCarN.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
            case NE:
                deleteCarBody();
                this.raceCarPicture = new Picture(getX()-10,getY(),"resources/smallCarNE.png");
                raceCarPicture.draw();
                currentDirection = newDirection;
                break;
        }
    }

    private void deleteCarBody(){
        if(raceCarPicture == null){
            return;
        }
        raceCarPicture.delete();
    }









}