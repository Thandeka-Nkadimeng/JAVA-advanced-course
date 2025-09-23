/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.Exercises;

/**
 * The Department class represents an organizational department with a name, an
 * ID, and a number of employees.
 *
 * Validation rules: 1. Department name must be exactly two letters. 2.
 * Department ID must be a three-digit number between 100 and 499 inclusive. 3.
 * Number of employees must be between 4 and 10.
 *
 * If these rules are not met, a DepartmentException is thrown.
 *
 * @author Thandeka Nkadimeng
 */
public class Department {

    private String departmentName;
    private int departmentId;
    private int numEmployees;

    public Department(String departmentName, int departmentId, int numEmployees) throws DepartmentException {
        // Validate department name: must be exactly 2 letters
        if (departmentName == null || departmentName.length() != 2) {
            throw new DepartmentException(departmentName, departmentId, numEmployees,
                    "Department name must be exactly two letters.");
        }

        // Validate department ID: must be between 100 and 499
        if (departmentId < 100 || departmentId > 499) {
            throw new DepartmentException(departmentName, departmentId, numEmployees,
                    "Department ID must be between 100 and 499.");
        }

        // Validate employees: must be between 4 and 10
        if (numEmployees < 4 || numEmployees > 10) {
            throw new DepartmentException(departmentName, departmentId, numEmployees,
                    "Number of employees must be between 4 and 10.");
        }

        // If all validations pass, I assign fields
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "==========Deatils ============================="
                + " \nDepartment [Name=" + departmentName
                + " \nDepartment ID=" + departmentId
                + " \nNumber Of Employees=" + numEmployees + "]";
    }
}
