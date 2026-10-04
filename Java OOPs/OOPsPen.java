class Pen {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is :" + this.color);
    }
}

public class OOPsPen {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "Blue";

        Pen p2 = new Pen();
        p2.color = "Black";

        Pen p3 = new Pen();
        p3.color = "Red";

        Pen p4 = new Pen();
        p4.color = "White";

        p1.printColor();
        p2.printColor();
        p3.printColor();
        p4.printColor();
    }
}