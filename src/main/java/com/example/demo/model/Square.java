package com.example.demo.model;

import com.example.demo.model.piece.Piece;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public abstract class Square {

    private final Position position;
    private final Color color;

    @Autowired
    public Square(final Position position, final Color color) {
        this.position = Objects.requireNonNull(position, "position must not be null");
        this.color = Objects.requireNonNull(color, "color must not be null");
    }

    public Position getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPieceOnSquare();
}
