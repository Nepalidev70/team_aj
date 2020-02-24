package org.academiadecodigo.hackstreetboys.moveLogic;

import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public final class MovementLogic {

    public static boolean moveCar(Car car, Track currentTrack){
        int nextX = xDirectionalMove(car.getCurrentDirection(),car.getFrontBumper());
        int nextY = xDirectionalMove(car.getCurrentDirection(),car.getFrontBumper());
        if(currentTrack.isOnRoad(nextX,nextY)){
            System.out.println("its on track");
            switch (car.getCurrentDirection()){
                case E:
                    moveCarBody(10,0,car);
                    return true;
                case SE:
                    moveCarBody(10,10,car);
                    return true;
                case S:
                    moveCarBody(0,10,car);
                    return true;
                case SW:
                    moveCarBody(-10,10,car);
                    return true;
                case W:
                    moveCarBody(-10,0,car);
                    return true;
                case NW:
                    moveCarBody(-10,-10,car);
                    return true;
                case N:
                    moveCarBody(0,-10,car);
                    return true;
                case NE:
                    moveCarBody(10,-10,car);
                    return true;
            }
        }
        System.out.println("Somehow not on track");
        return false;
    }

    public static int xDirectionalMove(Direction direction, Rectangle rectangle){
        switch(direction){
            case E:
                return rectangle.getX() + 10;
            case SE:
                return rectangle.getX() + 10;
            case S:
                return rectangle.getX();
            case SW:
                return rectangle.getX() - 10;
            case W:
                return rectangle.getX() - 10;
            case NW:
                return rectangle.getX() - 10;
            case N:
                return rectangle.getX();
            case NE:
                return rectangle.getX()+10;
        }
        return 0;
    }

    public static int yDirectionalMove(Direction direction, Rectangle rectangle){
        switch(direction){
            case E:
                return rectangle.getY();
            case SE:
                return rectangle.getY() + 10;
            case S:
                return rectangle.getY() + 10;
            case SW:
                return rectangle.getY() + 10;
            case W:
                return rectangle.getY();
            case NW:
                return rectangle.getY() - 10;
            case N:
                return rectangle.getY() - 10;
            case NE:
                return rectangle.getY()-10;
        }
        return 0;
    }

    private static void moveCarBody(int deltaX, int deltaY,Car car){
        car.getFrontBumper().translate(deltaX,deltaY);
        car.getCarBody().translate(deltaX,deltaY);
    }

}
