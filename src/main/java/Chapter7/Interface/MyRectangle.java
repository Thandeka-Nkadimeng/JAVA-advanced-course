/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.Interface;

/**
 *
 * @author Thandeka Nkadimeng This class implements methods from {@code IShape}
 * and {@code IGraphics} interface
 */
public class MyRectangle implements IShape, IGraphics {

    private int length, width;

    public MyRectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void display() {
        System.out.println("=======" + this.getClass().getSimpleName() + "========");
        System.out.println("length: " + length
                + "width: " + width
                + "Perimeter: " + getPerimeter()
                + "Area:" + getArea());
    }

    @Override
    public void applyPaint(String color) {
    
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
