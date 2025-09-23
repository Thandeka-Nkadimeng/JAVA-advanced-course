/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class MySquare extends MyShape {

    public MySquare(int side) {
        super(side, 0);
    }

    public double calcArea() {
        return this.length * this.length;
    }

    public void display(String shape) {
        System.out.println("=================" + shape + "=============================");
        System.out.println("Side: " + this.length);
        System.out.println("Area: " + this.calcArea());
    }
}
