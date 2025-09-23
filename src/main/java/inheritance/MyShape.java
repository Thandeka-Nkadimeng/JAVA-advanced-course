/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * protected attributes are accessable within the parent class
 * and any other child class that inherits from the parent class
 * @author Thandeka Nkadimeng
 */
public class MyShape {

    protected int length;
    protected int wifth;

    public MyShape(int length, int wifth) {
        this.length = length;
        this.wifth = wifth;
    }

    public double calcArea() {
        return this.length * this.wifth;
    }
    
    public void display(String shape){
        System.out.println("\n=================" + shape + "=============================");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.wifth);
        System.out.println("Area: " + this.calcArea());
    }
}
