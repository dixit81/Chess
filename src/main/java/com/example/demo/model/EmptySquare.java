package com.example.demo.model;

import com.example.demo.model.piece.Piece;

public class EmptySquare extends Square {
    public EmptySquare(final Position position, final Color color) {
        super(position, color);
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPieceOnSquare() {
        return null;
    }
}
