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
public abstract class MyShape {
/**
 * Calculate the area 
 * @return the area as a (@code double)
 */
    public abstract double calcArea();
/**
 * Calculate the perimeter 
 * @return the perimeter as a (@code double)
 */
    public abstract double calcPerimeter();
/**
 * Display the details of the shape 
 * @param shapetype the type of shape
 */
    public abstract void display();
/**
 * Draw the shape
 * 
 */
    public abstract void draw();
}
