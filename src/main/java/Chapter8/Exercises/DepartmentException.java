/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Exercises;

/**
 * The DepartmentException class is a custom exception that handles invalid
 * department details. It is thrown when a department does not meet the required
 * validation rules such as name length, ID range, or number of employees.
 *
 * Purpose: - Provide descriptive error messages for invalid department data. -
 * Extend Java's Exception class to allow checked exception handling.
 *
 * @author Thandeka Nkadimeng
 */
public class DepartmentException extends Exception {
//I know they didn't say put message, but I just put it ...

    public DepartmentException(String department, int deptId, int maxEmployees, String message) {
        super("Department Error [" + department + ", ID: " + deptId + ", Employees: " + maxEmployees + "] - " + message);
    }
}
