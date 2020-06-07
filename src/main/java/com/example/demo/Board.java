package com.example.demo;

import com.example.demo.model.Color;
import com.example.demo.model.EmptySquare;
import com.example.demo.model.Position;
import com.example.demo.model.Square;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Board {

    private final Square[][] squares;
    private static final int ROW_LENGTH = 8;
    private static final int COL_LENGTH = 8;

    @Autowired
    public Board(final Square[][] squares) {
        this.squares = squares;
    }

    public Board createBoard() {
        for (int i = 0; i < ROW_LENGTH; i++) {
            for (int j = 0; j < COL_LENGTH; j++) {
                if ((i + j) % 2 == 0) {
                    squares[i][j] = new EmptySquare(new Position(i, j), Color.BLACK);
                } else {
                    squares[i][j] = new EmptySquare(new Position(i, j), Color.WHITE);
                }
            }
        }

        return new Board(squares);

    }

    public Square getSquare(final Position position) {
        return null;
    }
}
