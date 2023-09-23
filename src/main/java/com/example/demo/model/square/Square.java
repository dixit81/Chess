package com.example.demo.model.square;

import com.example.demo.model.Color;
import com.example.demo.model.piece.Piece;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public abstract class Square {

    private final int position;

    private static final Map<Integer, EmptySquare> EMPTY_TILES = createAllEmptyTiles();

    @Autowired
    Square(final int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPieceOnSquare();

    public static Square createSquare(final int position, final Piece piece) {
        return piece != null ? new OccupiedSquare(position, piece) : EMPTY_TILES.get(position);
    }

    private static Map<Integer, EmptySquare> createAllEmptyTiles() {
        final Map<Integer, EmptySquare> emptySquareMap = new HashMap<>();

        for(int i=0; i<64; i++) {
            emptySquareMap.put(i, new EmptySquare(i));
        }

        return ImmutableMap.copyOf(emptySquareMap);
    }
}
