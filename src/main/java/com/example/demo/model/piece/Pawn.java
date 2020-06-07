package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;
import com.example.demo.model.Position;
import com.google.common.collect.ImmutableList;

import java.util.Collection;
import java.util.List;

public class Pawn extends Piece {

    private static final Position[] startOffset = {
            new Position(2,0)
    };

    private static final Position[] normalOffset = {
            new Position(1,0)
    };

    private static final Position[] attackOffset = {
            new Position(1,1),
            new Position(-1,1)
    };


    public Pawn(final Position currentPosition, final Color color, final Board board) {
        super(currentPosition, color, board);
    }

    @Override
    protected Collection<Move> calculateValidMoves() {
        List<Move> validMoves = calculateNormalMoves();
        List<Move> attackMoves = calculateAttackMoves();
        validMoves.addAll(attackMoves);

        return ImmutableList.copyOf(validMoves);
    }

    // TODO
    private List<Move> calculateNormalMoves() {
        return null;
    }

    // TODO
    private List<Move> calculateAttackMoves() {
        return null;
    }
}
