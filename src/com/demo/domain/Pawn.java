package com.demo.domain;

public class Pawn extends Piece {

    public Pawn(Position position, String name) {
        super(position, name);
    }

    @Override
    public void move(Position destination) {
        if (destination.getCol() == this.getPosition().getCol() &&
                destination.getRow() == this.getPosition().getRow()+1) {
            this.setPosition(destination);
        } else throw new RuntimeException("Invalid Move");
    }


}
