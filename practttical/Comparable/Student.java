//This code defines a class called Student that implements the Comparable interface, which allows objects of this class to be compared to one another.
//
//The Student class has four private instance variables: rollNumber, name, course, and fee, which represent the roll number, name, course, and fee of a student, respectively.
//
//The class has a default constructor and a parameterized constructor that takes in four arguments and initializes the instance variables accordingly.
//
//The class also has getter and setter methods for each instance variable.
//
//The compareTo method compares the current Student object with another Student object o. This method compares the names of the two students using the compareTo method of the String class. If the name of the current object is greater than the name of the object being compared, it returns a positive integer. If the name of the current object is less than the name of the object being compared, it returns a negative integer. If the names are equal, it returns 0.
//
//There is also a commented-out block of code that shows how the compareTo method can be used to compare roll numbers instead of names, using integer comparison.
package Comparable;

public class Student implements Comparable<Student> {

    private int rollNumber;
    private String name;
    private String course;
    private int fee;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;

    }

    public String getCourse() {
        return course;
    }

    public int getFee() {
        return fee;
    }

    public Student(int rollNumber, String name, String course, int fee) {
        super();
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
    }

    @Override
    public int compareTo(Student o) {
//		Integer Sorting

//		if(this.rollNumber > o.getRollNumber())
//			return 1;
//		else if(this.rollNumber<o.getRollNumber())
//			return -1;
//		else
//		return 0;
//		String Sorting 
        return this.name.compareTo(o.getName());

    }

}