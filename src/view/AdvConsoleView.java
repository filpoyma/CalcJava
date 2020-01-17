package view;

import controller.GameController;

public class AdvConsoleView extends ConsoleView{

    public AdvConsoleView(final GameController gameController) {
        super(gameController);
    }

    public void showGameName() {
        printLine();
        System.out.print(gameController.getGameName());
        printLine();
        System.out.println();
    }

    public void showPlayersName() { System.out.println(gameController.getPlayersName()); }

    private void printLine(){
        System.out.print("***");
    }
}
