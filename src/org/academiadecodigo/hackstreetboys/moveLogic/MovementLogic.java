package org.academiadecodigo.hackstreetboys.moveLogic;

import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.grid.Track;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public final class MovementLogic {

    public static boolean move(Car car, Track currentTrack){
        //int
        //if(currentTrack.isOnRoad())
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
        }
        return rectangle.getX()+10;
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
        }
        return rectangle.getX()+10;
    }

}
