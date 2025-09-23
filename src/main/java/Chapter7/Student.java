package Chapter7;

public class Student{
    String stNumber;
    String firstname;
    String lastname;
    String major;

    public String getStNumber() {
        return stNumber;
    }

    public void setStNumber(String stNumber) {
        this.stNumber = stNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    

    @Override
    public String toString() {
        return "Student{" + "stNumber=" + stNumber + ", firstname=" + firstname + ", lastname=" + lastname + ", major=" + major + '}';
    }
    
    
}