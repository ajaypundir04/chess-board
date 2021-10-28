package com.demo.domain;

public abstract class Piece {
    private Position position;
    private String name;

    public Piece(Position position, String name) {
        this.position = position;
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move(Position destination);
}
