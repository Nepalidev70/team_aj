package org.academiadecodigo.hackstreetboys.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SplashScreen {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private int cellSize = 10;
    private Rectangle rectangle;

    public void init() {
        while (true) {
            boolean draw1 = false;

            if (!draw1) {
                try {
                    Thread.sleep(1000);
                Picture background = new Picture(0, 0, "resources/SplashScreen1.png");
                background.grow(00, 00);
                background.draw();
                draw1 = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if (draw1) {
                try {
                    Thread.sleep(1000);
                    Picture background2 = new Picture(0, 0, "resources/SplashScreen2.png");
                    background2.grow(00, 00);
                    background2.draw();
                    draw1 = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
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
