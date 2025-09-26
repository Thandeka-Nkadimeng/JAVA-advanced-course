/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreAnnotations {

    @BeforeAll
    void setup() {
        System.out.println("Getting things started...");
    }

    @AfterAll
    void finish() {
        System.out.println("\nAll test are completed...");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before each test...");
    }

    @Test
    @DisplayName("TC1 - First Test")
    @Order(2)
    void firstTest() {
        System.out.println("First Test Method");
    }

    @Test
    @DisplayName("TC2 - Second Test")
    @Order(1)
    @Tag("Regression")
    void secondTest() {
        System.out.println("Second Test Method");
    }

    @Test
    @DisplayName("TC3 - Third  Test")
    @Order(1)
    @Tag("Integration")
    void thirdTest() {
        System.out.println("Third Test Method");
    }

    @Test
    @DisplayName("TC4 - Forth  Test")
    @Order(4)
    @Tag("Integration")
    @Tag("Regression")
    void forthTest() {
        System.out.println("forth Test Method");
    }
}
