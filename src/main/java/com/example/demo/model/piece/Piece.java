package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;

import java.util.Collection;
import java.util.Objects;

public abstract class Piece {

    private final int currentPosition;
    private final Color color;

    public Piece(final int currentPosition, final Color color) {
        this.currentPosition = currentPosition;
        this.color = Objects.requireNonNull(color, "color must not be null");
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public Color getColor() {
        return color;
    }

    protected abstract Collection<Move> calculateValidMoves(final Board board);

    boolean isWithinBoardLimits(int newPosition) {
        return 0 <= newPosition && 64 >= newPosition;
    }
}
