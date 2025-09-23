/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.Interface;

/**
 *
 * @author Thandeka Nkadimeng
 */
public interface IShape {
    //They are abstract and public by default

    /**
     * Calculate the area
     *
     * @return the area as a (@code double)
     */
    double getArea();

    /**
     * Calculate the perimeter
     *
     * @return the perimeter as a (@code double)
     */
    double getPerimeter();

    /**
     * Display the details of the shape
     *
     */
    void display();
}
