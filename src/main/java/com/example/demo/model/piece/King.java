package com.example.demo.model.piece;

import com.example.demo.model.Color;
import com.example.demo.model.Move;

import java.util.Collection;

public class King extends Piece {


    public King(int currentPosition, Color color) {
        super(currentPosition, color);
    }

    @Override
    protected Collection<Move> calculateValidMoves() {
        return null;
    }
}
