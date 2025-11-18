package logics.Assignment7.stream2;

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

    public double getGpa() { return gpa; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getAge() { return age; }
    public int getYear() { return year; }
    public int getNumberOfIncompleteCourses() { return numberOfIncompleteCourses; }

    @Override
    public String toString() {
        return String.format("%s (%s, GPA: %.2f, Age: %d, Year: %d, Incomplete: %d)",
                name, major, gpa, age, year, numberOfIncompleteCourses);
    }
}
