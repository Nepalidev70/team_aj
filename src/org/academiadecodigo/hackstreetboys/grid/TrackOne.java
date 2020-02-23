package org.academiadecodigo.hackstreetboys.grid;

import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;
import java.util.List;

public class TrackOne implements Track {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize = 10;
    private Rectangle rectangle;

    private Direction carStartingDirection = Direction.E;
    private static final int carStartX = 10;
    private static final int carStartY = 320;

    private LinkedList<Rectangle> roadRectangleContainer = new LinkedList<>();

    public TrackOne(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init(Color roadColor) {
        Picture background = new Picture(0,0,"resources/backgroundLisbon.png");
        background.grow(00,00);
        background.draw();
        buildRoad(roadColor);
    }

    @Override
    public int getCarStartX() {
        return carStartX;
    }

    @Override
    public int getCarStartY() {
        return carStartY;
    }

    public Direction getCarStartingDirection(){
        return this.carStartingDirection;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getWidth() {
        return this.rectangle.getWidth();
    }

    public int getHeight() {
        return this.rectangle.getHeight();
    }

    public int getX() {
        return rectangle.getX();
    }

    public int getY() {
        return rectangle.getY();
    }

    public int getCellSize() {
        return cellSize;
    }

    public int rowToY(int row) {
        return PADDING + cellSize * row;
    }

    public int columnToX(int column) {
        return PADDING + cellSize * column;
    }

    public void buildRoad(Color color) {

        Rectangle rectangle1 = new Rectangle(00, 305, 332, 40);
        rectangle1.setColor(color);
        rectangle1.fill();
        roadRectangleContainer.add(rectangle1);

        Rectangle rectangle2 = new Rectangle(330, 44, 24, 300);
        rectangle2.setColor(color);
        rectangle2.fill();
        roadRectangleContainer.add(rectangle2);

        Rectangle rectangle3 = new Rectangle(329, 05, 329, 40);
        rectangle3.setColor(color);
        rectangle3.fill();
        roadRectangleContainer.add(rectangle3);

        Rectangle rectangle4 = new Rectangle(658, 05, 24, 600);
        rectangle4.setColor(color);
        rectangle4.fill();
        roadRectangleContainer.add(rectangle4);

        Rectangle rectangle5 = new Rectangle(658, 600, 178, 40);
        rectangle5.setColor(color);
        rectangle5.fill();
        roadRectangleContainer.add(rectangle5);

        Rectangle rectangle6 = new Rectangle(832, 600, 24, 300);
        rectangle6.setColor(color);
        rectangle6.fill();
        roadRectangleContainer.add(rectangle6);

        Rectangle rectangle7 = new Rectangle(832, 890, 178, 40);
        rectangle7.setColor(color);
        rectangle7.fill();
        roadRectangleContainer.add(rectangle7);

        Rectangle rectangle8 = new Rectangle(1010, 590, 35, 340);
        rectangle8.setColor(color);
        rectangle8.fill();
        roadRectangleContainer.add(rectangle8);

        Rectangle rectangle9 = new Rectangle(1010, 590, 155, 50);
        rectangle9.setColor(color);
        rectangle9.fill();
        roadRectangleContainer.add(rectangle9);

    }

    public boolean isOnRoad(int nextX, int nextY){
        boolean finalBoolean = false;
        for(Rectangle road : roadRectangleContainer){
            if(nextX >= road.getX() && nextX <= road.getX() + road.getWidth() && nextY >= road.getY() && nextY <= road.getY() + road.getHeight() ){
                finalBoolean = true;
            }
        }
        return finalBoolean;
    }



}




