package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;
import com.example.demo.model.Position;
import com.example.demo.model.Square;
import com.google.common.collect.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class Knight extends Piece {

    private static final Position[] offsets = {
            new Position(-2, 1),
            new Position(-2, -1),
            new Position(2, 1),
            new Position(2, -1),
            new Position(-1, 2),
            new Position(-1, -2),
            new Position(1, 2),
            new Position(1, -2),
    };

    @Autowired
    public Knight(final Position currentPosition, final Color color, final Board board) {
        super(currentPosition, color, board);
    }

    @Override
    protected Collection<Move> calculateValidMoves() {

        final List<Move> validMoves = new ArrayList<>();

        Arrays.stream(offsets).forEach(offset -> {
            Position movedPosition = calculatePosition(offset);

            // check if not out of board
            if (positionWithinBoundaries(movedPosition)) {
                validMoves.add(new Move(currentPosition, movedPosition));
            }

            // check if the new position tile is not occupied
            Square square = board.getSquare(movedPosition);
            if (square.isTileOccupied()) {
                // if tile is occupied by enemy piece, it's still valid
                if(!square.getPieceOnSquare().getColor().equals(color)) {
                    validMoves.add(new Move(currentPosition, movedPosition));
                }
            } else {
                validMoves.add(new Move(currentPosition, movedPosition));
            }

        });

        return ImmutableList.copyOf(validMoves);
    }

    @NotNull
    private Position calculatePosition(final Position offset) {
        int newXValue = this.currentPosition.getxVal() + offset.getxVal();
        int newYValue = this.currentPosition.getyVal() + offset.getyVal();
        return new Position(newXValue, newYValue);
    }

}
