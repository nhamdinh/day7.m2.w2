package Resizeable;


import Interfacce.Resizeable;

public class Square extends Shape implements Resizeable {
    private Double side;

    public Square() {
    }

    public Square(Double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, Double side) {
        super(color, filled);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public String getArea() {
        return "" + side * side;
    }

    public String getPerimeter() {
        return "" + side * 4;
    }

    public String toString() {
        return "A Square with width="
                + side
                + ", which is a subclass of "
                + super.toString();
    }

    public void reScale(int n) {
        side *= n;
    }


}
