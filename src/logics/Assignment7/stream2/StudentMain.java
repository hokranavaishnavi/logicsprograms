package logics.Assignment7.stream2;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class StudentMain {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(Arrays.asList(new Student(3.8, "Alice Johnson", "Computer Science", 20, 2, 0),
                new Student(3.9, "Eva Thompson", "Computer Science", 19, 1, 0),
                new Student(3.7, "Isabella Clark", "Computer Science", 20, 2, 0),
                new Student(3.4, "Liam Scott", "Computer Science", 22, 3, 1),
                new Student(3.6, "Mia Lewis", "Computer Science", 23, 4, 0),
                new Student(3.2, "Noah Walker", "Computer Science", 21, 2, 1),
                new Student(3.5, "Olivia Hall", "Computer Science", 22, 3, 0),
                new Student(3.2, "Bob Smith", "Mechanical Engineering", 22, 3, 1),
                new Student(3.4, "Paul Reed", "Mechanical Engineering", 24, 4, 0),
                new Student(3.1, "Quentin Gray", "Mechanical Engineering", 23, 3, 2),
                new Student(3.6, "Rachel Young", "Mechanical Engineering", 21, 2, 1),
                new Student(3.3, "Samuel King", "Mechanical Engineering", 25, 5, 0),
                new Student(3.7, "Tina Brooks", "Mechanical Engineering", 22, 3, 0),
                new Student(2.9, "Catherine Adams", "Civil Engineering", 21, 1, 2),
                new Student(3.6, "David Brown", "Electrical Engineering", 23, 4, 0),
                new Student(2.5, "Frank Martin", "Business Administration", 24, 4, 3),
                new Student(3.4, "Grace Parker", "Psychology", 22, 3, 1),
                new Student(3.1, "Henry Wilson", "Mathematics", 21, 2, 2),
                new Student(2.8, "Jack Turner", "History", 23, 4, 4)));

        //       1.  Write a program that takes a set of Student objects as input and performs the following operations:
        //        Group the students by their major into a Map where the key is the major and
        //        the value is a set of students in that major,
        //        but only for majors with more than 5 students and an average GPA above 3.0.
        //                Sort the students within each major in ascending order of their GPA,
        //                and then by their age in descending order.
        //                Return the Map containing the grouped and sorted students.

        Map<String, Set<Student>> collect1 = students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.toSet()))
                .entrySet().stream().filter(e -> e.getValue().size() > 5 && e.getValue().stream()
                        .mapToDouble(Student::getGpa).average().orElse(0) > 3)
                .map(stringSetEntry -> {
                    Set<Student> collect = stringSetEntry.getValue().stream().sorted(Comparator.comparing(Student::getGpa)
                            .thenComparing(Student::getAge).reversed()).collect(Collectors.toCollection(LinkedHashSet::new));
                    return entry(stringSetEntry.getKey(), collect);
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));// //
        System.out.println(collect1);


        //--------------------------------------------------------------------------------------------------------------

        //Task 2:
//Implement a program that reads a set of Student objects from the user and performs the following operations:
//Filter out all students who have a GPA less than the average GPA of all students, but have an age above 18 and a major in Biology or Chemistry.
//Calculate the total years of enrollment of the remaining students, but only for those who have joined in the last 4 years and are majoring in Computer Science or Engineering.
//Find the student with the highest years of enrollment and return their details, but only if they have an age below 30 and a GPA above 3.7.

        double avg = students.stream().mapToDouble(Student::getGpa).average().orElse(0);

        Set<Student> mycollect = students.stream().filter(student -> !(student.getGpa() < avg && student.getAge() > 18 && (student.getMajor().equals("Biology") || student.getMajor().equals("Chemistry"))))
                .collect(Collectors.toSet());

        System.out.println(mycollect);

        int cur_year= Year.now().getValue();
        int sum = mycollect.stream().filter(student -> (cur_year - student.getYear()) <= 4 && (student.getMajor().equals("Computer Science") || student.getMajor().equals("Civil Engineering")))
                .mapToInt(Student::getYear).sum();

        System.out.println(sum);

        Optional<Student> highestYears = mycollect.stream()
                .filter(s -> s.getAge() < 30 && s.getGpa() > 3.7)
                .max(Comparator.comparingInt(Student::getYear));

        System.out.println("Student with highest enrollment: " +
                highestYears.orElse(null));



//        Task 3:
//        Create a program that takes a set of Student objects as input and performs the following operations:
//        Filter out all students who have joined in the last 3 years and have a major in Mathematics, but have a GPA below 3.0 and are on academic probation.
//                Calculate the sum of the GPAs of the remaining students, but only for those who have an age above 22 and a GPA above the average GPA.
//                Find the average age of the remaining students, but only if their department has more than 10 students and an average GPA above 3.5.
//                Calculate the factorial of the average age, but only if the total years of enrollment of all students is greater than 30 and the average GPA is below 3.9.

        List<Student> filteredTask3 = students.stream()
                .filter(s -> !(s.getYear() <= 3 &&
                        s.getMajor().equals("Mathematics") &&
                        s.getGpa() < 3.0 &&
                        s.getNumberOfIncompleteCourses() > 0))
                .toList();

        double avgGPAAfterFilter = filteredTask3.stream()
                .mapToDouble(Student::getGpa).average().orElse(0);

        double sumGPA = filteredTask3.stream()
                .filter(s -> s.getAge() > 22 && s.getGpa() > avgGPAAfterFilter)
                .mapToDouble(Student::getGpa).sum();

        System.out.println("Sum of GPAs (Filtered): " + sumGPA);

        Map<String, List<Student>> deptGroup = filteredTask3.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        deptGroup.forEach((dept, list) -> {
            double avg1 = list.stream().mapToDouble(Student::getGpa).average().orElse(0);
            if (list.size() > 10 && avg1 > 3.5) {
                double avgAge = list.stream().mapToInt(Student::getAge).average().orElse(0);
                System.out.println("Average age for " + dept + ": " + avgAge);

                int totalYearsAll = students.stream()
                        .mapToInt(Student::getYear).sum();

                if (totalYearsAll > 30 && avg1 < 3.9) {
                    long factorial = 1;
                    for (int i = 1; i <= (int) avgAge; i++) factorial *= i;
                    System.out.println("Factorial of average age: " + factorial);
                }
            }
        });
    } }


