package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize = 10;

    private Rectangle rectangle;

    Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

    public void init() {
        rectangle = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        rectangle.draw();
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
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
}
