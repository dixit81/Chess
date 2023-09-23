package com.example.demo;

import com.example.demo.model.square.Square;
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

    public Square getSquare(final int position) {
        return null;
    }
}
