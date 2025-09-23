/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.util.Scanner;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class ProductRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        int qty;
        try {
            System.out.println("Enter price: ");
            price = sc.nextDouble();

            System.out.println("Enter quantity:");
            qty = sc.nextInt();

            Product pro = new Product("CK200", "Coke Zero", price, qty);
            pro.sell(5);
            pro.increasePrice(5);

            System.out.println(pro);

        } catch (IllegalArgumentException | LowStockException | HighPriceIncreaseException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing the scanner object.....");

        }

    }
}
