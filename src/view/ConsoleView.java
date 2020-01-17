package view;

import controller.GameController;

public class ConsoleView{

    protected final GameController gameController;

    public ConsoleView(GameController gameController) { this.gameController = gameController; }

    public void showGameName() { System.out.println(gameController.getGameName()); }

    public void showPlayersName() { System.out.println(gameController.getPlayersName()); }

    public void showFigBoard(){
        System.out.println(gameController.getBoard().getFigure(0,0));
    }

}
