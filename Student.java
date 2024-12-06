import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int rollNumber;
    private String studentgrade;

    public Student(String name, int rollNumber, String studentgrade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentgrade = studentgrade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return studentgrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String studentgrade) {
        this.studentgrade = studentgrade;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Grade: " + studentgrade;
    }
}