package com.example.demo.model;

import com.example.demo.model.piece.Piece;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public abstract class Square {

    private final int position;
    private final Color color;

    @Autowired
    public Square(final int position, final Color color) {
        this.position = position;
        this.color = Objects.requireNonNull(color, "color must not be null");
    }

    public int getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPieceOnSquare();
}
