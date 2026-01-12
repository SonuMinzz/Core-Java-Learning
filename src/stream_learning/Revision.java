package stream_learning;
import java.util.*;
import java.util.stream.Collectors;

public class Revision {

    public static void main(String[] args)
    {
       // 1.Convert a List<String> to uppercase

        List<String> fruits=List.of("apple","mango","litchi","guava");
        fruits.stream()
                .map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));


      //  2.From a list of integers, filter even numbers and collect into a list.

        List<Integer> numList=List.of(12,13,15,6,7);
       List<Integer> evenList= numList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        for(Integer num:evenList)
        {
            System.out.println(num);
        }


     //   3.Count how many strings have length > 5
        List<String> names=List.of("rahul","mohani","rohan","priyaJeet","ankit");
        long namesCount=  names.stream()
                .filter(s->s.length()>5)
                .count();
        System.out.println(namesCount);

     /*  4.Sort a list of integers:
            ascending
            descending
*/
        List<Integer> numbers=List.of(2,7,12,5,3,87,34);
      List<Integer> ascOrder=  numbers.stream()
                .sorted()
                .collect(Collectors.toList());

      for(Integer n:ascOrder)
      {
          System.out.println(n);
      }

     //   5.Find the first element starting with "S" from a list of strings.
     //   Approach 1:

        List<String> names=List.of("Ankit","Rahul","Rohan","Sam","Sangita","Mohan");
       List<String> namesWithS= names.stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());

       System.out.println(namesWithS.get(0));

      //   Approach 2:
        List<String> names=List.of("Ankit","Rahul","Rohan","Sam","Sangita","Mohan");
       Optional<String> firstNameWithS= names.stream()
                       .filter(s->s.startsWith("S"))
                               .findFirst();
       firstNameWithS.ifPresent(s->System.out.println(s));


       // 6.Find the sum of all even numbers in a list.

        List<Integer> numbers=List.of(12,56,2,6,9,10);
        int sum=numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.summingInt(n->n));
        System.out.println("Sum:"+sum);

       // 7.Remove duplicate elements from a list.

        List<Integer> numList=List.of(1,4,6,2,4,1);
       numList.stream()
               .collect(Collectors.toSet())
               .forEach(s->System.out.print(s+"\t"));



List<Employee>employeeList = Arrays.asList(
        new Employee(101,"Rahul","Lucknow","rahul@gmail.com","IT"),
        new Employee(102,"Mohan","AjabGarh","mohan@gmail.com","HR"),
        new Employee(103,"Rohan","Ranchi","rohan@gmail.com","SALES"),
        new Employee(104,"Animesh","Delhi","animesh@gmail.com","IT"),
        new Employee(105,"Ankit","Gurugao","ankit@gmail.com","HR")
);

 employeeList.forEach(e->System.out.print(e));

 //8.Group employees by department.

        Map<String,List<Employee>> groupByDepartment= employeeList.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));
        groupByDepartment.forEach((dept, empList) -> {
            System.out.print(dept + " : ");
            empList.forEach(e -> System.out.print(e + " | "));
            System.out.println();
        });





    }
}
