package org.academiadecodigo.hackstreetboys.grid;


import org.academiadecodigo.hackstreetboys.GameLogic;
import org.academiadecodigo.hackstreetboys.music.JLayer;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.File;

public class SplashScreen implements KeyboardHandler {

    private boolean keyPressed;
    private Picture background = new Picture();
    String path = "resources/The_Chain.mp3";
    File mp3File = new File(path);
    JLayer.PlayMp3 music = new JLayer.PlayMp3();

    Keyboard keyboard = new Keyboard(this);

    public void init() {

        // -- SPACE -- //
        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);

        music.play(mp3File);
        music.start();

        while (!keyPressed) {
            boolean draw1 = false;

            if (!draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/SplashScreen1.png");
                    background.draw();
                    draw1 = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if (draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/SplashScreen2.png");
                    background.draw();
                    draw1 = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        background.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_SPACE:
                keyPressed = true;
                GameLogic gameLogic = new GameLogic();
                music.stop();

                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}