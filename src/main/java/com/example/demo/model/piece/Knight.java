package com.example.demo.model.piece;

import com.example.demo.Board;
import com.example.demo.model.Color;
import com.example.demo.model.Move;
import com.example.demo.model.square.Square;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Knight extends Piece {

    private static final int[] offsets = {17, 15, 10, 6, -6, -10, -15, -17};

    public Knight(final int currentPosition, final Color color) {
        super(currentPosition, color);
    }

    @Override
    public Collection<Move> calculateValidMoves(final Board board) {

        final Collection<Move> validMoves = new ArrayList<>();

        IntStream.range(0, offsets.length)
                .map(pos -> this.getCurrentPosition() + pos)
                .forEach(newPosition -> {
                    final Square toOccupySquare = board.getSquare(newPosition);

                    if(isWithinBoardLimits(newPosition)) {
                        if (!toOccupySquare.isTileOccupied()) {
                            validMoves.add(new Move(this.getCurrentPosition(), newPosition));
                        } else {
                            final Piece pieceOnSquare = toOccupySquare.getPieceOnSquare();
                            final Color color = pieceOnSquare.getColor();

                            if(color != this.getColor()) {
                                // capture()?
                                validMoves.add(new Move(this.getCurrentPosition(), newPosition));
                            }
                        }
                    }
                });

        return validMoves;
    }


}
