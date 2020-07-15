package Chess;

import BoardingGame.BoardingException;

public class ChessException extends BoardingException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
