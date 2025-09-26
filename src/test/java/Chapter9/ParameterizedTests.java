/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class ParameterizedTests {

    @ParameterizedTest(name = "Test Pass Mark - [{index}] : {arguments}")
    @ValueSource(doubles = {77.5, 50, 64.9, 56, 23.8, 47})
    void testPassMark(double testMark) {

        boolean expected = true;
        boolean actual = testMark >= 66;
        Assertions.assertEquals(expected, actual, "Pass mark should be >= 66 [" + testMark + "]");
    }

    @ParameterizedTest(name = "Test names - [{index}] : {arguments}")
    @ValueSource(strings = {"Kate", "Jake", "Carol", "Tom", "John", "Jeckson", "Mike"})
    void testNameStartsWithJ(String name) {
        Assertions.assertTrue(name.startsWith("J"), name + "doesn't start with 'J'");
    }

    @ParameterizedTest
    @CsvSource({
        "Milk,20.99,50",
        "Cheese,55,25",
        "Eggs,78.99,70",
        "Bread,18.99,15"
    })
    void testLowStockProducts(String name, double price, int qtyInStock) {
        Assertions.assertTrue(
                qtyInStock < 50,
                "There is enough stock [" + qtyInStock + "] for [" + name + "]"
        );

        System.out.println("name = " + name + ", price = " + price + ", qtyInStock = " + qtyInStock);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/my_files/Student Test Mark.csv", numLinesToSkip = 1)
    void testFailedStudents(String firstname, String lastname, int testMark) {
        Assertions.assertTrue(
                testMark < 65,
                "Student [" + firstname + " " + lastname + "] managed to pass the test [" + testMark + "]"
        );
        System.out.println("Firstname: " + firstname + ", Lastname: " + lastname + ", Mark: " + testMark);
    }

    @ParameterizedTest
    @MethodSource("hobbies")
    void testHobbies(String hobby) {
        System.out.println("hobby = " + hobby);
    }

    static Stream<String> hobbies() {
        return Stream.of("Tennis", "Hockey", "Chess", "Hiking", "Soccer");
    }

    static Stream<Integer> randomNumbers() {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();
        int count = rnd.nextInt(15 - 5) + 5;
        for (int i = 0; i < 15; i++) {
            numbers.add(rnd.nextInt(70 - 10) + 10);
        }
        return numbers.stream();
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testEvenNumbers(int number) {
        Assertions.assertTrue(number % 2 == 0, number + " is not an even number");
        System.out.println("number = " + number);
    }
    
    @ParameterizedTest
    @MethodSource
    void RandomNumbers(int number){
    System.out.print("numbers = " + number);
    }
    
}
