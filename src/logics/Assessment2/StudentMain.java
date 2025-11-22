package logics.Assessment2;

import logics.Assignment7.stream2.Student;

import java.time.Year;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

public class StudentMain {


    public static void main(String[] args) {
        Set<logics.Assignment7.stream2.Student> students = new HashSet<>(Arrays.asList(new logics.Assignment7.stream2.Student(3.8, "Alice Johnson", "Computer Science", 20, 2, 0),
                new logics.Assignment7.stream2.Student(3.9, "Eva Thompson", "Computer Science", 19, 1, 0),
                new logics.Assignment7.stream2.Student(3.7, "Isabella Clark", "Computer Science", 20, 2, 0),
                new logics.Assignment7.stream2.Student(3.4, "Liam Scott", "Computer Science", 22, 3, 1),
                new logics.Assignment7.stream2.Student(3.6, "Mia Lewis", "Computer Science", 23, 4, 0),
                new logics.Assignment7.stream2.Student(3.2, "Noah Walker", "Computer Science", 21, 2, 1),
                new logics.Assignment7.stream2.Student(3.5, "Olivia Hall", "Computer Science", 22, 3, 0),
                new logics.Assignment7.stream2.Student(3.2, "Bob Smith", "Mechanical Engineering", 22, 3, 1),
                new logics.Assignment7.stream2.Student(3.4, "Paul Reed", "Mechanical Engineering", 24, 4, 0),
                new logics.Assignment7.stream2.Student(3.1, "Quentin Gray", "Mechanical Engineering", 23, 3, 2),
                new logics.Assignment7.stream2.Student(3.6, "Rachel Young", "Mechanical Engineering", 21, 2, 1),
                new logics.Assignment7.stream2.Student(3.3, "Samuel King", "Mechanical Engineering", 25, 5, 0),
                new logics.Assignment7.stream2.Student(3.7, "Tina Brooks", "Mechanical Engineering", 22, 3, 0),
                new logics.Assignment7.stream2.Student(2.9, "Catherine Adams", "Civil Engineering", 21, 1, 2),
                new logics.Assignment7.stream2.Student(3.6, "David Brown", "Electrical Engineering", 23, 4, 0),
                new logics.Assignment7.stream2.Student(2.5, "Frank Martin", "Business Administration", 24, 4, 3),
                new logics.Assignment7.stream2.Student(3.4, "Grace Parker", "Psychology", 22, 3, 1),
                new logics.Assignment7.stream2.Student(3.1, "Henry Wilson", "Mathematics", 21, 2, 2),
                new Student(2.8, "Jack Turner", "History", 23, 4, 4)));


//Implement a program that reads a set of Student objects from the user and performs the following operations:
// Filter out all students who have a GPA less than the average GPA of all students, but have an age above 18 and a major in Biology or Chemistry.
// Calculate the total years of enrollment of the remaining students, but only for those who have joined in the last 4 years and are majoring in Computer Science or Engineering.
// Find the student with the highest years of enrollment and return their details, but only if they have an age below 30 and a GPA above 3.7.

        double avg = students.stream()
                .filter(student -> !(student.getAge() > 18 && (student.getMajor().equals("Biology") || student.getMajor().equals("Chemistry"))))
                .mapToDouble(Student::getGpa).average().orElse(0);

        Set<Student> collect = students.stream().filter(student -> student.getGpa() < avg).collect(Collectors.toSet());


        int i = Integer.parseInt(String.valueOf(Year.now()));

        collect.stream().
                filter(student -> student.getYear() <= 4 && student.getMajor().equals("Computer Science") || student.getMajor().equals("Engineering"))
                .mapToInt(student -> student.getYear() - i).collect(Collectors.toSet());


    }
}
