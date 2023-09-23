package com.example.demo.model;

import com.example.demo.model.piece.Piece;

import java.util.Objects;

public class OccupiedSquare extends Square {

    private final Piece piece;

    public OccupiedSquare(final int position, final Color color, final Piece piece) {
        super(position, color);
        this.piece = Objects.requireNonNull(piece, "piece must not be null");
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPieceOnSquare() {
        return piece;
    }
}
