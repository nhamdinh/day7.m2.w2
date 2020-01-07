package Resizeable;

import Interfacce.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String getArea() {
        return ""+radius * radius * Math.PI;
    }

    public String getPerimeter() {
        return ""+2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public void reScale(int n) {
        radius *= n;
    }
}