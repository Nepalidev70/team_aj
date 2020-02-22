package org.academiadecodigo.hackstreetboys.grid;

import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;

public interface Track {

    public void init(Color color);
    public int getCarStartX();
    public int getCarStartY();
    public int getCols();
    public int getRows();
    public int getWidth();
    public int getHeight();
    public int getX();
    public int getY();
    public Direction getCarStartingDirection();
    public int getCellSize();
    public int rowToY(int row);
    public int columnToX(int column);
    public void buildRoad(Color color);
    public boolean isOnRoad(int nextX, int nextY);

}
