/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student st = new Student("1234568", "Nkadimeng", "Thandeka", "Python");

        st.displayStudent();

        PartTimeStudent objSt = new PartTimeStudent(true,"1234568", "Nkadimeng", "Thandeka", "Python");
//        Student st1 = new Student("1234568", "Nkadimeng", "Thandeka", "Python");
    }
}
