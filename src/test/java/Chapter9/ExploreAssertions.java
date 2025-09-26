/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

//import  org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class ExploreAssertions {

    static int num1, num2;

    @BeforeAll
    static void init() {
        int num1 = 6, num2 = 3;
    }

    @Test
    @DisplayName("Test Sum Of Two Numbers")
    void testSumOfTwoNumber() {
        //Arrange - define initial and expected values/ results

        int expected = 9;
        //Act | Actual - actual processing done by the system
        int actual = num1 + num2;

        //Assert - compare expected results with actual results.
        assertEquals(expected, actual, "Sum of " + num1 + " + " + num2 + " is: " + actual);
        //OR
        assertTrue(expected == actual);
    }

    @Test
    @DisplayName("Test Difference Of Two Numbers")
    void testDifferenceOfTwoNumber() {
        //Arrange - define initial and expected values/ results
        
        int expected = 3;
        //Act | Actual - actual processing done by the system
        int actual = num1 - num2;

        //Assert - compare expected results with actual results.
        assertEquals(expected, actual, "Difference of " + num1 + " - " + num2 + " is: " + actual);
        //OR
        assertTrue(expected == actual);
    }

    @Test
    @DisplayName("Compute sum, Difference, Product, Quotient")
    void testComputationOfNumber() {
        //Arrange - define initial and expected values/ results
       
        int expectedSum = 9;
        int expectedDiff = 3;
        int expectedProduct = 18;
        double expectedQuotient = 2.0;
        //Act | Actual - actual processing done by the system
        int actualSum = num1 + num2;
        int actualDifference = num1 - num2;
        int actualProduct = num1 * num2;
        double actualquotient = num1 / num2;
        //Assert - compare expected results with actual results.
        assertEquals(expectedSum, actualSum, "Sum of " + num1 + " + " + num2 + " is: " + actualSum);
        assertEquals(expectedProduct, actualProduct, "Product of " + num1 + " + " + num2 + " is: " + actualProduct);
        assertEquals(expectedQuotient, actualquotient, "Quotient of " + num1 + " + " + num2 + " is: " + actualquotient);
        assertEquals(expectedDiff, actualDifference, "Difference of " + num1 + " + " + num2 + " is: " + actualDifference);
        //OR
        assertTrue(expectedSum == actualSum);

        //OR
        assertAll(
                () -> assertEquals(expectedSum, actualSum, "Sum of " + num1 + " + " + num2 + " is: " + actualSum),
                () -> assertEquals(expectedProduct, actualProduct, "Product of " + num1 + " + " + num2 + " is: " + actualProduct),
                () -> assertEquals(expectedQuotient, actualquotient, "Quotient of " + num1 + " + " + num2 + " is: " + actualquotient),
                () -> assertEquals(expectedDiff, actualDifference, "Difference of " + num1 + " + " + num2 + " is: " + actualDifference)
        );
    }
}
