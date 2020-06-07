package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public final class Position {

    private final int xVal;
    private final int yVal;

    @Autowired
    public Position(final int xVal, final int yVal) {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public int getxVal() {
        return xVal;
    }

    public int getyVal() {
        return yVal;
    }

    public Position getPosition() {
        return new Position(xVal, yVal);
    }

}
