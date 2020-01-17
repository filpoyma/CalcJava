package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {

    public final int H_CELL = 3;
    public final int V_CELL = 3;
    public Figure[][] figures = new Figure[H_CELL][V_CELL];

    public Figure getFigure(int x, int y) {
        return figures[x][y];
    }

    public boolean setFigure(int x, int y, Figure figure) {
        figures[x][y] = figure;
        return true;
    }

    public void initArray(){
        figures[0][0] = new Figure("x");
        figures[0][1] = new Figure("o");
    }

    public void showBoard() {
            System.out.println(Arrays.deepToString(figures));
   }
}
