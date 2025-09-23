
package Chapter8.Exercises;

import java.util.Scanner;

/**
 * The CityNotFound class demonstrates exception handling using an array of cities.
 * It stores eight city names and allows the user to enter an index to display a city.
 * If the user enters an index that is out of range, an ArrayIndexOutOfBoundsException
 * is caught and an error message is displayed.
 * 
 * Steps:
 * 1. Declare an array of eight cities.
 * 2. Ask the user for an index input.
 * 3. Display the city at the given index inside a try block.
 * 4. Handle invalid indexes using a catch block.
 * 
 * @author Thandeka Nkadimeng
 */
public class CityNotFound {

    public static void main(String[] args) {
        // Step 1: Declare an array of 8 cities
        String[] cities = {
            "Pretoria", "Johannesburg", "Cape Town", "Durban",
            "Polokwane", "Bloemfontein", "Nelspruit", "Kimberley"
        };

        Scanner input = new Scanner(System.in);

        try {
            // Step 2: Ask user for an integer
            System.out.print("Enter an index number between 0 and 7: ");
            int index = input.nextInt();

            // Step 3: Display the city in that position
            System.out.println("City at index " + index + " is: " + cities[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Step 4: Handle invalid index
            System.out.println("Error: The index you entered is out of range! Please enter between 0 and 7.");
        }
    }
}
