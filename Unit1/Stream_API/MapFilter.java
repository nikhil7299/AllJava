package Unit1.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;
    public Employee(int empId,String empName,int salary){
        this.empId = empId;
        this.empName = empName;
        this.salary =salary;
    }
}

public class MapFilter {
    public  static  void  main(String [] args){
        List<Employee > e2 = Arrays.asList(new Employee(101,"Aman",15000), new Employee(102,"Abhishek",25000));
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(101,"Aman",15000));
        e.add(new Employee(102,"Abhishek",25000));
        e.add(new Employee(103,"Rishabh",60000));
        e.add(new Employee(104,"Arnav",45000));
        e.add(new Employee(105,"Kunal",23000));
        e.add(new Employee(106,"Aditya",38000));
        e.add(new Employee(107,"Rishi",65000));

        var empStream = e.stream().filter(ee-> ee.salary>30000).map(t->t.salary).collect(Collectors.toList());
        List<Object> empStreamAdded = e.stream().filter(ee-> ee.salary>30000).map(t->t.salary+5000).collect(Collectors.toList());

        System.out.println(empStream);
        System.out.println(empStreamAdded);
    }
}
