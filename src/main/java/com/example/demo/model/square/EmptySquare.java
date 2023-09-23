package com.example.demo.model.square;

import com.example.demo.model.piece.Piece;

public class EmptySquare extends Square {
    EmptySquare(final int position) {
        super(position);
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
