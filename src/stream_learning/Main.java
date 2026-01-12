package stream_learning;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public  static void main(String[] args)
    {

        //1. Convert a List<String> to uppercase:
        System.out.println("problem 1:");
        List<String> fruits=List.of("apple","banana","orange","mango","grapes");

     List<String> fruitsList= fruits.stream().map(s->s.toUpperCase()).collect(Collectors.toList());

     for(String s:fruitsList)
     {
         System.out.println(s);
     }

     //2.From a list of integers, filter even numbers and collect into a list.
        System.out.println("problem 2:");
        List<Integer> roll= List.of(10,24,23,16,45,37,82);
        List<Integer> even=roll.stream().filter(n->n%2==0).collect(Collectors.toList());

        for(Integer n:even)
        {
            System.out.println(n);
        }

        //3.Count how many strings have length > 5
        System.out.println("problem 3:");
        List<String> names=List.of("Rohan","Mohan","Amit","Rakesh");
        System.out.println(names.stream().count());

        /*4.Sort a list of integers:
        ascending
        descending
         */
        System.out.println("problem 4:");

        List<Integer> num=List.of(12,10,60,4,6,18);

        System.out.println("ascending order");
        num.stream().sorted().forEach(n->System.out.println(n));

        //descending order:
        System.out.println("descending order");
        num.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));

        //5.Find the first element starting with "A" from a list of strings.

        List<String> namesList=List.of("Mohan","Aliya","Ankit","Mohit","Anil");
       String name= namesList.stream().filter(s->s.startsWith("A")).findFirst().orElse("No name found");
       System.out.println(name);

       //6.Find the sum of all even numbers in a list.

        List<Integer> numbers=List.of(2,4,1,3,6,8);
       int sum= numbers.stream().filter(n->n%2==0).collect(Collectors.summingInt(n->n));
       System.out.println("Sum of even numbers:"+sum);

       //7.Remove duplicate elements from a list.
        System.out.println("operation 7:");
        List<String> fruit=List.of("apple","mango","orange","apple");
        fruit.stream().collect(Collectors.toSet()).forEach(s->System.out.println(s));

        //8.Group employees by department.
//
//      Map<String,List<Employee>> employeesByDept=  employees.stream().collect(Collectors.groupingBy(employee->employee.getDepartment()));
//
//
//      //🟡 Group by Department + Count Employees
//
//        Map<String,Integer> employeeGroupByDeptCountEmp=employees.stream()
//                .collect(Collectors.groupingBy(emp->emp.getDepartment()),Collectors.counting());







    }
}
