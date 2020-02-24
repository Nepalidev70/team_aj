package org.academiadecodigo.hackstreetboys.grid;


import org.academiadecodigo.hackstreetboys.GameLogic;
import org.academiadecodigo.hackstreetboys.Main;
import org.academiadecodigo.hackstreetboys.gameobjects.TimerForGame;
import org.academiadecodigo.hackstreetboys.music.JLayer;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.File;

public class EndScreen implements KeyboardHandler {

    private boolean keyPressed;
    private Picture background = new Picture();
    String path = "resources/The_Chain.mp3";
    File mp3File = new File(path);
    JLayer.PlayMp3 music = new JLayer.PlayMp3();

    Keyboard keyboard = new Keyboard(this);

    public void init(int minute, int seconds, int milliseconds) {

        music.play(mp3File);
        music.start();

        while (!keyPressed) {

            Text time = new Text(580, 410, " " + minute + " : " + seconds + " : " + milliseconds);
            time.setColor(Color.BLACK);
            time.grow(170,80);
            time.draw();

            boolean draw1 = false;

            if (!draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/Congratulations1.png");
                    background.draw();
                    draw1 = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if (draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/Congratulations2.png");
                    background.draw();
                    draw1 = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        background.delete();
    }


//GAME OVER
        public void gameOver () {
            music.play(mp3File);
            music.start();

        while (!keyPressed) {
            boolean draw1 = false;

            if (!draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/GameOver1.png");
                    background.draw();
                    draw1 = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if (draw1) {
                try {
                    Thread.sleep(750);
                    background.load("resources/GameOver2.png");
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
                break;
            case KeyboardEvent.KEY_Q:
                //QUIT!
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}