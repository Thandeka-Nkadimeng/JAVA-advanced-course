/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * @author Thandeka Nkadimeng
 * Parent class with common attributes for part-time and full-time
 * students
 */
public class Student {

    String stNumber;
    String lastname;
    String firstname;
    String major;

    public Student() {
        this.stNumber = "223179460";
        this.lastname = "Nkadimeng";
        this.firstname = "Thandeka";
        this.major = "Cs";
    }

    public Student(String stNumber, String lastname, String firstname, String major) {
//        this.stNumber = stNumber;
//        this.lastname = lastname;
//        this.firstname = firstname;
//        this.major = major;
//        

        setFirstname(firstname);
        setLastname(lastname);
        setStNumber(stNumber);
        setFirstname(firstname);
    }

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayStudent() {
        System.out.println("\nStudent Number: " + this.stNumber + "Lastname: " + this.lastname + "firstname: " + this.firstname);
        System.out.println("Major: " + this.major);
    }

}
