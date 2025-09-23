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
public interface IGraphics {

    /**
     * Apply paint on the shape
     *
     * @param color the color of the shape
     */
    void applyPaint(String color);

    /**
     * Draw the shape
     */
    void draw();

}
