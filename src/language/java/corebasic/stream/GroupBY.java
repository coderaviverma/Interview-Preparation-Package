package language.java.corebasic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class GroupBY {


    public static void main(String[] args) {
        List<Employee> allEmployees =new ArrayList<>();

        allEmployees.add(new Employee("CSE",20000));
        allEmployees.add(new Employee("ECE",10000));
        allEmployees.add(new Employee("MEC",10000));

        Map<String, Employee> topEmployees =
                allEmployees.stream()
                        .collect(groupingBy(
                                e -> e.department,
                                collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get)
                        ));

        System.out.println(topEmployees);
    }

   static class Employee {
        public String department;
        public int salary;

        public Employee(String department, int salary) {
            this.department = department;
            this.salary = salary;
        }

       public String getDepartment() {
           return department;
       }

       public void setDepartment(String department) {
           this.department = department;
       }

       public int getSalary() {
           return salary;
       }

       public void setSalary(int salary) {
           this.salary = salary;
       }

       @Override
       public String toString() {
           return "Employee{" +
                   "department='" + department + '\'' +
                   ", salary=" + salary +
                   '}';
       }
   }
}
