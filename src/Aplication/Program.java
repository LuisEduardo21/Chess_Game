package Aplication;

import BoardingGame.Board;
import BoardingGame.Position;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            Ui.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("source: ");
            ChessPosition source = Ui.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = Ui.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}
