package Resizeable;




public class   Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

public String getArea(){
        return "Area";
}
public String getPerimeter(){
        return "Perimeter";
    }

    public String toString() {
        return "A Shape with color of "
                + color
                + " and "
                + (isFilled()? "1 is filled " : " 0  is not filled");
    }
}