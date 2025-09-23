/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * @author Thandeka Nkadimeng Child class that inherits from Student class
 */
public class PartTimeStudent extends Student {

    private boolean isEmployed; //Unique attribute 

    public PartTimeStudent(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public PartTimeStudent(boolean isEmployed, String stNumber, String lastname, String firstname, String major) {
        super(stNumber, lastname, firstname, major);
        this.isEmployed = isEmployed;
    }

    public boolean isIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    @Override
    public void displayStudent() {
        System.out.println("\nStudent Number: " + this.stNumber + "Lastname: " + this.lastname + "firstname: " + this.firstname);
        System.out.println("Major: " + this.major);
        System.out.println("Employed? : " + this.isEmployed);
    }
}
