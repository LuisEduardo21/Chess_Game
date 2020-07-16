package Aplication;

import BoardingGame.Board;
import BoardingGame.Position;
import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                Ui.clearScreen();
                Ui.printMatch(chessMatch);
                System.out.println();
                System.out.print("source: ");
                ChessPosition source = Ui.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                Ui.clearScreen();
                Ui.printBoard(chessMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = Ui.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }catch(InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
