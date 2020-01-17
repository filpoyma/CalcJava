package model;

public class Player {

    private String name;
    private final String figure;

    public Player(String name, String figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getPlayerName() {
        return name;
    }

    public String getPlayerFigure() {
        return figure;
    }
}
