package org.academiadecodigo.hackstreetboys.controls;

import org.academiadecodigo.hackstreetboys.gameobjects.Car;
import org.academiadecodigo.hackstreetboys.Player;
import org.academiadecodigo.hackstreetboys.moveLogic.Direction;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class CarControls implements KeyboardHandler {

    private Player currentPlayer;
    private Keyboard keyboard;
    private Car car;

    public void init() {

        keyboard = new Keyboard(this);

        // -- A -- //
        KeyboardEvent aPressed = new KeyboardEvent();
        aPressed.setKey(KeyboardEvent.KEY_A);
        aPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(aPressed);

        // -- D -- //
        KeyboardEvent dPressed = new KeyboardEvent();
        dPressed.setKey(KeyboardEvent.KEY_D);
        dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(dPressed);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_A:
                car.setCurrentDirection(Direction.nextDirection(car.getCurrentDirection(),false));
                break;

            case KeyboardEvent.KEY_D:
                car.setCurrentDirection(Direction.nextDirection(car.getCurrentDirection(),true));
                break;
        }

    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        System.out.println("FUCK YOU SAM!!!!!");
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
