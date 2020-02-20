package org.academiadecodigo.hackstreetboys;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Obstacles {

    public void buildObstacles(){

        Rectangle rectangle = new Rectangle(300,300,100,100);
        rectangle.setColor(Color.LIGHT_GRAY);
        rectangle.fill();

    }








    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private Color color;
    private int cellSize = 10;

    private Rectangle rectangle;

    Obstacles (int cols, int rows, Color color) {
        this.cols = cols;
        this.rows = rows;
        this.color = color;
    }

    public void drawObstacles() {
        rectangle = new Rectangle(PADDING,PADDING,cols*cellSize,rows*cellSize);

        rectangle.setColor(this.color);
        rectangle.draw();
        rectangle.fill();
    }

    public int getCols() { return cols; }

    public int getRows() {
        return rows;
    }

    public Color getColor() {return this.color;}

    public int getWidth() { return this.rectangle.getWidth(); }

    public int getHeight() {return this.rectangle.getHeight(); }

    public int getX() {return rectangle.getX();}

    public int getY() { return rectangle.getY();}

    public int getCellSize() { return cellSize; }

    public int rowToY(int row) { return PADDING + cellSize * row; }

    public int columnToX(int column) { return PADDING + cellSize * column; }
}
