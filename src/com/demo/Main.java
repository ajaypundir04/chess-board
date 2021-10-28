package com.demo;

import com.demo.domain.ChessBoard;
import com.demo.domain.Position;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.displayBoard();

        chessBoard.movePiece(chessBoard.getBoard()[1][1], new Position(2, 1));
        System.out.println("After Move");
        chessBoard.displayBoard();
    }
}

// class Represents boards displaying pieces

//  Move Piece to one cell to another (validate Move)

// Pieces


// Board

// ChessBoard
// 2D arrays 8*8
