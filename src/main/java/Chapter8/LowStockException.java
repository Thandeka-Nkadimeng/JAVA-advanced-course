/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 * @author Thandeka Nkadimeng
 * Thrown when a (@code product) has a low quantity in stock
 */
public class LowStockException extends Exception{
/** 
 * Constructs an {@code LowStockException} with the specified detailed message
 * @param message : the detailed message
 */
    public LowStockException(String message) {
        super(message);
    }
    
}
