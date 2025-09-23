/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.Abstraction;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class MyRectangle extends MyShape {

    private int length, width;

    public MyRectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public double calcArea() {
        return this.length * this.width;
    }

    @Override
    public double calcPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void display() {
        System.out.println("=======" + this.getClass().getSimpleName() + "========");
        System.out.println("length: " + length
                + "width: " + width
                + "Perimeter: " + calcPerimeter()
                + "Area:" + calcArea());
    }

    @Override
    public void draw() {

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }

    }

}
