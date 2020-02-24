package org.academiadecodigo.hackstreetboys.moveLogic;

public enum Direction {
    N(0),
    NE(1),
    E(2),
    SE(3),
    S(4),
    SW(5),
    W(6),
    NW(7);

    private int order;

    Direction(int order){
        this.order = order;
    }

    public static Direction nextDirection(Direction currentDirection, boolean goToNext){
        if(currentDirection.equals(Direction.N) && !goToNext){
            return Direction.NW;
        }
        if(currentDirection.equals(Direction.NW) && goToNext){
            return Direction.N;
        }
        if(goToNext){
            return Direction.values()[currentDirection.order +1];
        }
        return Direction.values()[currentDirection.order -1];
    }

}
