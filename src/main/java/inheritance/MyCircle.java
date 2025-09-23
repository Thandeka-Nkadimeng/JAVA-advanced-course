package inheritance;

// Circle class
public class MyCircle extends MyShape {

    public MyCircle(int radius) {
        super(radius, 0);  // I need only the length 
    }

    @Override
    public double calcArea() {
        return Math.PI * this.length * this.length; 
    }

    @Override
    public void display(String shape) {
        System.out.println("\n=================" + shape + "=============================");
        System.out.println("Radius: " + this.length);
        System.out.println("Area: " + this.calcArea());
    }
}
