import controller.GameController;
import model.Board;
import model.Figure;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        GameController gameController = new GameController("XO");
        ConsoleView consoleView = new ConsoleView(gameController);
        Figure figureX = new Figure("X");
        consoleView.showGameName();

        //board.initArray();
        //System.out.println(board.getFigure(0, 0));

        board.setFigure(0,0, figureX);
        consoleView.showFigBoard();


    }
}
