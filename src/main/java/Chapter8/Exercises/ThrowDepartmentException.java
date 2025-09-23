/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Exercises;

/**
 * The ThrowDepartmentException class is the runner/test class that creates
 * multiple Department objects with both valid and invalid data.
 *
 * Purpose: - Demonstrate the use of custom exceptions (DepartmentException). -
 * Display a success message when a department is created successfully. -
 * Display an error message when invalid data is provided.
 *
 * Steps: 1. Define an array of test department data. 2. Attempt to construct
 * Department objects in a try block. 3. Catch and handle DepartmentException
 * for invalid data.
 *
 * @author Thandeka Nkadimeng
 */
public class ThrowDepartmentException {

    public static void main(String[] args) {
        // Array of department test data
        Object[][] testData = {
            {"IT", 101, 5},
            {"HR", 250, 4},
            {"MK", 499, 10},
            {"FIN", 120, 6},
            {"SA", 50, 7},
            {"QA", 300, 2},
            {"OP", 450, 12}
        };

        for (int i = 0; i < testData.length; i++) {
            try {
                Department dept = new Department((String) testData[i][0], (int) testData[i][1], (int) testData[i][2]);
                System.out.println("Created successfully: " + dept);
            } catch (DepartmentException e) {
                System.out.println("Failed to create department: " + e.getMessage());
            }
        }

    }
}
