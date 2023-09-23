package com.example.demo.model.square;

import com.example.demo.model.piece.Piece;

import java.util.Objects;

public class OccupiedSquare extends Square {

    private final Piece piece;

    OccupiedSquare(final int position, final Piece piece) {
        super(position);
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
