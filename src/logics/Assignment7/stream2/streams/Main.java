package logics.Assignment7.stream2.streams;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee("Alice Johnson", "IT", "Manager", 38, 4, 120000, 4, 11, "Full-Time"),
                new Employee("Bob Smith", "IT", "Developer", 29, 5, 125000, 5, 12, "Full-Time"),
                new Employee("Charlie Davis", "HR", "Manager", 45, 18, 150000, 3, 13, "Full-Time"),
                new Employee("Diana Patel", "Finance", "Analyst", 32, 7, 78000, 4 , 14,"Full-Time"),
                new Employee("Ethan Brown", "Sales", "Manager", 41, 2, 110000, 2,15,"Part-Time"),
                new Employee("Fiona Wilson", "Marketing", "Executive", 27, 3, 62000, 5, 16, "Part-Time"),
                new Employee("George Miller", "IT", "Developer", 36, 10, 98000, 3, 17,"Full-Time"),
                new Employee("Hannah Garcia", "HR", "Manager", 30, 6, 95000, 4, 18, "Full-Time"),
                new Employee("Ian Thompson", "Finance", "Manager", 50, 3, 175000, 5, 19,"Part-Time"),
                new Employee("Julia Roberts", "Sales", "Executive", 28, 4, 70000, 3, 20, "Full-Time")
        );

//1

        //Implement a program that reads a list of Employee objects from the user and performs the following operations:
        //Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years.
        //Sort the remaining employees in descending order of their years of experience, and then by their performance ratings in ascending order.
        //Return a new list containing the names of the remaining employees, but with each name reversed and in uppercase.
        List<StringBuilder> manager1 = employees.stream().filter(employee -> !(employee.getJobTitle().equals("Manager") &&
                        employee.getSalary() > 100000 && employee.getYearsOfExperience() > 3))
                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()
                        .thenComparing(Employee::getPerformanceRating))
                .map(employee -> new StringBuilder(employee.getName().toUpperCase()).reverse()).toList();
        System.out.println(manager1);



        //2.

//        Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8, but have a salary between 60,000 and 120,000.
//        Sort the remaining employees in ascending order of their salaries, and then by their years of experience in descending order.
//                Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.
        List<Integer> collect = employees.stream()
                .filter(e -> !(e.getYearsOfExperience() <= 5 &&
                        e.getPerformanceRating() < 8 &&
                        e.getSalary() >= 60000 &&
                        e.getSalary() <= 120000
                ))
                .sorted(
                        Comparator.comparing(Employee::getSalary) // salary ascending
                                .thenComparing(Employee::getYearsOfExperience, Comparator.reverseOrder()) // experience descending
                )
                .map(e -> e.getId() * 10) // return ID * 10
                .collect(Collectors.toList());
        System.out.println(collect);


        //3.
//        Write a program that reads a list of Employee objects from the user and performs the following operations:
//        Remove all employees who are part-time and have a salary less than 50,000, but are in the Sales or Marketing department.
//                Calculate the sum of the salaries of the remaining employees, but only for those who have more than 3 years of experience.
//                Find the average age of the remaining employees, but only for those who have a performance rating of at least 7.

        List<Employee> collect1 = employees.stream().filter(employee -> !(employee.getJobtype().equals("Part-Time") && employee.getSalary() < 50000) &&
                        employee.getDepartment().equals("Sales") || employee.getDepartment().equals("Marketing"))
                .collect(Collectors.toList());
        System.out.println(collect1);

       double sum= collect1.stream().filter(employee -> (employee.getYearsOfExperience() > 3)).mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

        int average = (int)collect1.stream().filter(employee -> (employee.getPerformanceRating() >= 7)).mapToInt(Employee::getAge).average().orElse(0);
        System.out.println(average);

    }

}
