package Aplication;

import BoardingGame.Board;
import BoardingGame.Position;
import Chess.ChessMatch;

public class Program {

    public static void main(String[] args){

        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());
    }
}
