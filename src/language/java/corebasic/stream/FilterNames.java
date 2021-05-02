package language.java.corebasic.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {

    public static void main(String[] args) {

        List<Employee> ls=new ArrayList();
        ls.add(new Employee("Avinash",29));
        ls.add(new Employee("Apoorva",26));
        ls.add(new Employee("Anu",24));
        ls.add(new Employee("Kiran",25));
        ls.add(new Employee("Shivangi",30));
        ls.add(new Employee("Ruchi",18));
        ls.add(new Employee("Madhu",28));


        Comparator<Employee> comparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return String.valueOf(o1.age).compareTo(o2.age+"");
            }
        };

      ls=  ls.stream().filter(s->s.getName().toLowerCase().startsWith("a")).sorted().collect(Collectors.toList());

        System.out.println(ls);
    }


    static class Employee implements Comparable<Employee>{
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        @Override
        public int compareTo(Employee o) {
            return name.compareTo(o.getName());
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
