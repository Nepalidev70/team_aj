package org.academiadecodigo.hackstreetboys.controls;

import org.academiadecodigo.hackstreetboys.menu.Menu;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MenuNavigation implements KeyboardHandler {


    private Menu currentMenu;
    private Keyboard keyboard;

    public void init() {

        keyboard = new Keyboard(this);

        // -- SPACE -- //
        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(spacePressed);

        // -- B -- //
        KeyboardEvent bPressed = new KeyboardEvent();
        bPressed.setKey(KeyboardEvent.KEY_B);
        bPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(bPressed);

        // -- UP -- //
        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(upPressed);

        // -- DOWN -- //
        KeyboardEvent downPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_DOWN);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(downPressed);


        // -- E -- // ---------------> THIS IS FOR "SECRET STUFF"

        KeyboardEvent ePressed = new KeyboardEvent();
        ePressed.setKey(KeyboardEvent.KEY_E);
        ePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(ePressed);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_SPACE:
                currentMenu.goForward();
                break;

            case KeyboardEvent.KEY_B:
                currentMenu.goBack();
                break;

            case KeyboardEvent.KEY_UP:
                currentMenu.selectionUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                currentMenu.selectionDown();
                break;

            case KeyboardEvent.KEY_E:
                currentMenu.secretStuff();
                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void setCurrentMenu(Menu currentMenu) {
        this.currentMenu = currentMenu;
    }
}


