package org.academiadecodigo.hackstreetboys.menu;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SplashScreen implements Menu {

    public static final int PADDING = 10;

    private Picture background = new Picture();
    private boolean menuRunning = true;

    public void init() throws InterruptedException {
        while (menuRunning) {
            boolean draw1 = false;

            if (!draw1) {
                this.background.load("resources/SplashScreen1.png");
                background.grow(00, 00);
                background.draw();
                draw1 = true;
                Thread.sleep(100);
            }
            if (draw1) {
                background.load("resources/SplashScreen2.png");
                background.grow(00, 00);
                background.draw();
                draw1 = false;
                Thread.sleep(100);
            }

        }
    }

    @Override
    public void goBack() {
    }

    @Override
    public void goForward() {
        menuRunning = false;
    }

    @Override
    public void selectionUp() {

    }

    @Override
    public void selectionDown() {

    }

    @Override
    public void secretStuff() {

    }
}
