package org.academiadecodigo.hackstreetboys.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public interface Track {

    public void init(Color color);
    public int getCols();
    public int getRows();
    public int getWidth();
    public int getHeight();
    public int getX();
    public int getY();
    public int getCellSize();
    public int rowToY(int row);
    public int columnToX(int column);
    public void buildRoad(Color color);
    public boolean isOnRoad(int nextX, int nextY);

}
