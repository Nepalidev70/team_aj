package org.academiadecodigo.hackstreetboys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Obstacles {
    Color color;
    public void buildObstacles(Color color) {
        this.color = color;
        Rectangle rectangle1 = new Rectangle(00, 305, 332, 40);
        rectangle1.setColor(color);
        rectangle1.fill();

        Rectangle rectangle2 = new Rectangle(330, 44, 24, 300);
        rectangle2.setColor(color);
        rectangle2.fill();

        Rectangle rectangle3 = new Rectangle(329, 05, 329, 40);
        rectangle3.setColor(color);
        rectangle3.fill();

        Rectangle rectangle4 = new Rectangle(658, 05, 24, 600);
        rectangle4.setColor(color);
        rectangle4.fill();

        Rectangle rectangle5 = new Rectangle(658, 600, 178, 40);
        rectangle5.setColor(color);
        rectangle5.fill();

        Rectangle rectangle6 = new Rectangle(832, 600, 24, 300);
        rectangle6.setColor(color);
        rectangle6.fill();

        Rectangle rectangle7 = new Rectangle(832, 890, 178, 40);
        rectangle7.setColor(color);
        rectangle7.fill();

        Rectangle rectangle8 = new Rectangle(1010, 590, 35, 340);
        rectangle8.setColor(color);
        rectangle8.fill();

        Rectangle rectangle9 = new Rectangle(1010, 590, 155, 50);
        rectangle9.setColor(color);
        rectangle9.fill();

    }
}
