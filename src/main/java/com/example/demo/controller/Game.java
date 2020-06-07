package com.example.demo.controller;

import com.example.demo.Board;
import com.example.demo.model.piece.Piece;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Game {

    private final Board board;
    private final List<Piece> pieces;


    public Game(final Board board, final List<Piece> pieces) {
        this.board = board;
        this.pieces = pieces;
    }

}
