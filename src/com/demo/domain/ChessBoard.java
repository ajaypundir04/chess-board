package com.demo.domain;

import java.util.Objects;

public class ChessBoard {

    private final Piece[][] board = new Piece[8][8];

    public ChessBoard() {
        initializeChessBoard();
    }

    private void initializeChessBoard() {
        Pawn pawn = new Pawn(new Position(1, 1), "p");
        Pawn pawn1 = new Pawn(new Position(6, 6), "P");
        board[pawn.getPosition().getRow()][pawn.getPosition().getCol()] = pawn;
        board[pawn1.getPosition().getRow()][pawn1.getPosition().getCol()] = pawn1;
    }

    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Objects.isNull(board[i][j]))
                    System.out.print("-");
                else System.out.print(board[i][j].getName());
            }
            System.out.println();
        }
    }

    public void movePiece(Piece piece, Position destination) {
        Position oldPosition = piece.getPosition();
        try {
            piece.move(destination);
            board[oldPosition.getRow()][oldPosition.getCol()] = null;
            board[piece.getPosition().getRow()][piece.getPosition().getCol()] = piece;
        } catch (RuntimeException e) {
            piece.setPosition(oldPosition);
        }

    }

    public Piece[][] getBoard() {
        return board;
    }
}
