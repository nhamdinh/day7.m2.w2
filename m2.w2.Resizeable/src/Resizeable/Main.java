package Resizeable;


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("red", false, 6);
        Square s = new Square("red",false,5.5);
        Rectangle r = new Rectangle(6, 6, "blue", true);
        System.out.println("Before: ");
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
        c.reScale(2);
        r.reScale(3);
        s.reScale(4);
        System.out.println("After Resize: ");
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}