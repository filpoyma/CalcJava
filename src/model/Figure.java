package model;

public class Figure {

    private Board board;
    private final String figure;

    public Figure(String figure) {
        assert figure != null;
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return figure;
    }
}
