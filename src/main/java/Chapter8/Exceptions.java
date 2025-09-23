/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class Exceptions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int number;
        int numerator, denominator;
        double quotient;

        try {
            System.out.println("\nEnter your name...");
            name = sc.nextLine();

            System.out.println("Enter numerator...");
            numerator = sc.nextInt();

            System.out.println("Enter denominator");
            denominator = sc.nextInt();

            quotient = numerator / denominator;

            System.out.println("Your nsme is: " + name);
            System.out.println("The last letter of your name ( " + name + ")" + name.substring(4));
            System.out.println("Quotient: " + quotient);
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input type");
        } catch (ArithmeticException ex) {
            System.err.println("Cannot divide by 0");
        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println("Error: The last letter of (" + name + ") should be at position"
                    + name.indexOf(name.substring(name.length() - 1)) + "(" + name.substring(name.length()-1) + ")");
        }
    }
}
