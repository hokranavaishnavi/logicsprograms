package logics.Assessment2;

public class Student {
    private double gpa;
    private String name;
    private String major;
    private int age;
    private int year;
    private int numberOfIncompleteCourses;

    public Student(double gpa, String name, String major, int age, int year, int numberOfIncompleteCourses) {
        this.gpa = gpa;
        this.name = name;
        this.major = major;
        this.age = age;
        this.year = year;
        this.numberOfIncompleteCourses = numberOfIncompleteCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfIncompleteCourses() {
        return numberOfIncompleteCourses;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, GPA: %.2f, Age: %d, Year: %d, Incomplete: %d)",
                name, major, gpa, age, year, numberOfIncompleteCourses);
    }


    //Implement a program that reads a set of Student objects from the user and performs the following operations:
    // Filter out all students who have a GPA less than the average GPA of all students, but have an age above 18 and a major in Biology or Chemistry.
    // Calculate the total years of enrollment of the remaining students, but only for those who have joined in the last 4 years and are majoring in Computer Science or Engineering.
    // Find the student with the highest years of enrollment and return their details, but only if they have an age below 30 and a GPA above 3.7.

}