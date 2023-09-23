package com.example.demo.model.piece;

import com.example.demo.model.Color;
import com.example.demo.model.Move;

import java.util.Collection;

public class Rook extends Piece {

    public Rook(int currentPosition, Color color) {
        super(currentPosition, color);
    }

    @Override
    protected Collection<Move> calculateValidMoves() {
        return null;
    }
}
