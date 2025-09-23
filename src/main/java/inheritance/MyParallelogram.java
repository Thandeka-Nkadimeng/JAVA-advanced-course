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
public class MyParallelogram extends MyShape {
    
    private int height;

    public MyParallelogram(int base, int height) {
        super(base, 0); // I do not need the width hence i set it to be 0
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.length * this.height;
    }

    @Override
    public void display(String shape) {
        System.out.println("\n=================" + shape + "=============================");
        System.out.println("Base: " + this.length);
        System.out.println("Height: " + this.height);
        System.out.println("Area: " + this.calcArea());
    }
}
