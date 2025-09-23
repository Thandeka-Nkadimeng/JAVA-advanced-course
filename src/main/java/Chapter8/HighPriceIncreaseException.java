/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author Thandeka Nkadimeng Thrown when there is a price increase on a
 * {@code Product}
 */
public class HighPriceIncreaseException extends RuntimeException {

    public HighPriceIncreaseException(String message) {
        super(message);
    }
    /**
     *
     * Constructs a {@code HighPriceIncreaseException} with the specified
     * detailed message
     */

}
