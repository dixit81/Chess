package com.example.demo.model;

import java.util.Objects;

public class Move {

    private final Position initialPosition;
    private final Position newPosition;

    public Move(final Position initialPosition, final Position newPosition) {
        this.initialPosition = Objects.requireNonNull(initialPosition, "initialPosition must not be null");
        this.newPosition = Objects.requireNonNull(newPosition, "newPosition must not be null");
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public Position getNewPosition() {
        return newPosition;
    }
}
