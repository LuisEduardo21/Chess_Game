package BoardingGame;

public class Board {
    private int rows;
    private int column;
    private Piece[][] pieces;

    public Board(int rows, int column) {
        if(rows < 1 || column < 1 ){
            throw new BoardingException("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.column = column;
        pieces = new Piece[rows][column];
    }

    public int getRows() {
        return rows;
    }

    public int getColumn() {
        return column;
    }

    public Piece piece(int rows, int column){
        if (!positionExists(rows, column)){
            throw new BoardingException("Position not on the board");
        }
        return pieces[rows][column];
    }
    public Piece piece(Position position){
        if (!positionExists(position)){
            throw new BoardingException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardingException("There is already a piece on position"+position);
        }
        pieces[position.getRow()][position.getColumn()]= piece;
        piece.position = position;
    }
    public boolean positionExists(int row, int columns){
      return row >=0 && row < rows && columns >= 0 && columns < column;
    }
    public boolean positionExists(Position position){
        return positionExists(position.getRow(),position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardingException("Position not on the board");
        }
        return piece(position) != null;
    }
}
