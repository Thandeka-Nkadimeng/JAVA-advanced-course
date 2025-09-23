package inheritance;

// Triangle class
public class MyTriangle extends MyShape {

    public MyTriangle(int base, int height) {
        super(base, height);  // length = base, width = height
    }

    @Override
    public double calcArea() {
        return 0.5 * this.length * this.wifth;
    }

    @Override
    public void display(String shape) {
        super.display(shape);
    }
}
