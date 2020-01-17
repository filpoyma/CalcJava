package controller;

import model.Board;
import model.Player;

public class GameController {

    public final String gameName;

    public Board board;
    private final static int MAX_COORDINATE = 2;
    private final static int MIN_COORDINATE = 0;
    private final static int MAX_PLAYERS = 2;

    public GameController(String gameName){
        if(gameName.isEmpty() || gameName == null)
            this.gameName = "X_0";
        else this.gameName = gameName;
    }

    private Player[] player = new Player[]{ new Player("Max", "X"),
                                            new Player("Leo", "O") };

    public Board getBoard() { return board; }
    public String getGameName() { return gameName; }
    public Player currentPlayer() { return null; }
    public Player[] getPlayersName() { return player; }

    public boolean move(int x, int y) {
        if(isCoordinate(x) && isCoordinate(y))
            return true;
        return false;
    }

    private final boolean isCoordinate(int coordinate){
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE)
            return false;
        return true;
    }
}
