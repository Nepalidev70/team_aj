package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Main {
    public static void main(String[] args) {

        Grid newGrid = new Grid(100, 100);
        newGrid.init();
        Obstacles obstacle = new Obstacles(100, 5, Color.CYAN);
        obstacle.drawObstacles();
        Obstacles obstacle2 = new Obstacles(10, 10, Color.PINK);
        obstacle.buildObstacles();


    }
}
