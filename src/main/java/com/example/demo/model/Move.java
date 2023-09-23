package com.example.demo.model;

import java.util.Objects;

public class Move {

    private final int initialPosition;
    private final int newPosition;

    public Move(final int initialPosition, final int newPosition) {
        this.initialPosition = initialPosition;
        this.newPosition = newPosition;
    }

    public int getInitialPosition() {
        return initialPosition;
    }

    public int getNewPosition() {
        return newPosition;
    }
}
