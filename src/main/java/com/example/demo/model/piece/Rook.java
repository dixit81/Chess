package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;
import com.example.demo.model.Position;
import com.example.demo.model.Square;
import com.google.common.collect.ImmutableList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rook extends Piece {

    private static final Position[] offsets = {
            new Position(1, 0),
            new Position(0, 1),
            new Position(-1, 0),
            new Position(0, -1),
    };

    public Rook(final Position currentPosition, final Color color, final Board board) {
        super(currentPosition, color, board);
    }

    @Override
    protected Collection<Move> calculateValidMoves() {
        final List<Move> validMoves = new ArrayList<>();

        // TODO Ewwww Java 7
        for(final Position offset: offsets) {
            while (positionWithinBoundaries(currentPosition)) {
                final Position movedPosition = calculatePosition(offset);
                if(positionWithinBoundaries(movedPosition)) {
                    Square square = board.getSquare(movedPosition);
                    if(!square.isTileOccupied()) {
                        validMoves.add(new Move(currentPosition, movedPosition));
                    } else {
                        if(!square.getPieceOnSquare().getColor().equals(color)) {
                            validMoves.add(new Move(currentPosition, movedPosition));
                        }
                        break;
                    }
                }
            }
        }

        return ImmutableList.copyOf(validMoves);
    }

    @NotNull
    private Position calculatePosition(final Position offset) {
        int newXValue = this.currentPosition.getxVal() + offset.getxVal();
        int newYValue = this.currentPosition.getyVal() + offset.getyVal();
        return new Position(newXValue, newYValue);
    }
}
