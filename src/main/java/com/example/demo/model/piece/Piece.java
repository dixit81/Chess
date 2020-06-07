package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;
import com.example.demo.model.Position;

import java.util.Collection;
import java.util.Objects;

public abstract class Piece {

    protected final Position currentPosition;
    protected final Color color;
    protected Board board;

    public Piece(final Position currentPosition, final Color color) {
        this.currentPosition = Objects.requireNonNull(currentPosition, "currentPosition must not be null");
        this.color = Objects.requireNonNull(color, "color must not be null");
    }

    public Piece(final Position currentPosition, final Color color, final Board board) {
        this.currentPosition = Objects.requireNonNull(currentPosition, "currentPosition must not be null");
        this.color = Objects.requireNonNull(color, "color must not be null");
        this.board = Objects.requireNonNull(board, "board must not be null");
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public Color getColor() {
        return color;
    }

    public boolean positionWithinBoundaries(final Position movedPosition) {
        return movedPosition.getxVal() >= 0 && movedPosition.getyVal() >= 0
                && movedPosition.getxVal() < 8 && movedPosition.getyVal() < 8;
    }

    protected abstract Collection<Move> calculateValidMoves();
}
