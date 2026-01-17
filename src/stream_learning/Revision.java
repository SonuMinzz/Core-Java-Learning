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

        List<Employee> employees=Arrays.asList(
                new Employee(101,"rohit","varanasi","rohit@gmail","HR",50000),
                new Employee(102,"mohit","bombay","mohit@gmail","IT",45000),
                new Employee(103,"sohit","delhi","sohit@gmail","HR",65000),
                new Employee(104,"vineeta","kolkata","vineeta@gmail","IT",80000),
                new Employee(105,"akriti","pune","akriti@gmail","IT",55000)

        );




 employees.forEach(e->System.out.print(e));

 //8.Group employees by department.

        Map<String,List<Employee>> groupByDepartment= employees.stream()
                .collect(Collectors.groupingBy(e->e.getDepartment()));
        groupByDepartment.forEach((dept, empList) -> {
            System.out.print(dept + " : ");
            empList.forEach(e -> System.out.print(e + " | "));
            System.out.println();
        });
        //9.Partition numbers into even and odd.

        List<Integer> numbers=List.of(12,3,56,23,1,6,7,16);
       // System.out.print(numbers);

        // 1st way (Trivial):
       List<Integer> evenList= numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
       List<Integer> oddList=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());

       System.out.println(evenList);
       System.out.println(oddList);
       // 2nd way( groupBy)

        Map<String,List<Integer>> groupedNumbers=numbers.stream()
                .collect(Collectors.groupingBy(
                        n->n%2==0?"EVEN":"ODD")
                );
        System.out.println(groupedNumbers);

        //3rd way(partitioningBy)

        Map<Boolean,List<Integer>> partitioned=numbers.stream().collect(
                Collectors.partitioningBy(
                        n->n%2==0?true:false
                )
        );

        System.out.println(partitioned);

        //10.Find the maximum number from a list using streams.

        // whenever you see n-largest number remember distinct,skip(n-1) (n stands for nth largest

        List<Integer> numList=List.of(2,6,12,8,45,12,89,34);
        Optional<Integer> largest=numList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .findFirst();

        largest.ifPresent(n->System.out.println(n));

       // 11.Find the second highest number from a list.

        List<Integer> numList=List.of(1,5,3,12,78,45,67,12,98);
        int n=2;
        Optional<Integer> secondLargest=numList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst();
        secondLargest.ifPresent(num->System.out.println(num));


        //12.From a list of strings, find the longest string.

        List<String> names=List.of("Alex","Animesh","Annie","Jonathan");
       Optional<String> longestName= names.stream()
                .sorted(Comparator.comparing((String s)->s.length()).reversed())
               .skip(1)
               .findFirst();

       longestName.ifPresent(s->System.out.println(s));


        // 13.Safely handle null values using Optional.

/*        ❌ Traditional (unsafe):

        String name = getName();
        System.out.println(name.length()); // NPE risk


✅ With Optional:

        Optional<String> name = getName();
        name.ifPresent(n -> System.out.println(n.length()));

        Correct ways
        Optional<String> opt1 = Optional.of("Alex");      // value guaranteed
        Optional<String> opt2 = Optional.ofNullable(name); // may be null
        Optional<String> opt3 = Optional.empty();         // no value

        7️⃣ Real-world example (Interview GOLD ⭐)
        Null-safe DB response
        Optional<User> userOpt = Optional.ofNullable(userRepo.findById(id));

        String username = userOpt
                .map(u -> u.getName())
                .orElse("Guest");


        🔥 Optional Interview Cheat Sheet
        Method	Purpose
        of()	value must be non-null
        ofNullable()	value may be null
        empty()	no value
        ifPresent()	execute if value exists
        map()	transform value
        flatMap()	avoid nested Optional
        filter()	conditional logic
        orElse()	default value
        orElseGet()	lazy default
        orElseThrow()	throw custom exception
            */


      //  14.Find highest paid employee in each department.

        /*
        IT:[EMP1:{45000},EMP2:{50000},EMP3:{35000}]
        HR:[EMP1:{60000},EMP2:{75000}]

        result:
        IT:[EMP2:{50000}]
        HR:[EMP2:{75000}]

       approach :
       1. groupBY department
       2. maxBY(Comparator.comparing(e->e.getSalary());
        */

        List<Employee> employeeList=Arrays.asList(
                new Employee(101,"rohit","varanasi","rohit@gmail","HR",50000),
                new Employee(102,"mohit","bombay","mohit@gmail","IT",45000),
                new Employee(103,"sohit","delhi","sohit@gmail","HR",65000),
                new Employee(104,"vineeta","kolkata","vineeta@gmail","IT",80000),
                new Employee(105,"akriti","pune","akriti@gmail","IT",55000)

        );
      Map<String,Optional<Employee>> highestPaidEmployeeEachDept=employeeList.stream()
              .collect(Collectors.groupingBy(
                      e->e.getDepartment(),
                      Collectors.maxBy(Comparator.comparing(e->e.getSalary()))
              ));

      System.out.println(highestPaidEmployeeEachDept);

      // 15.Find average salary of employees per department.
       /*
        IT:[EMP1:{45000},EMP2:{50000},EMP3:{35000}]
        HR:[EMP1:{60000},EMP2:{75000}]

        result:
        IT:AVG_SALARY of IT department
        HR:AVG_SALARY of HR department

        approach:
        1. groupBy department
        2. Collectors.averagingBY
       */

        Map<String,Double> avgSalaryPerDepartment=employeeList.stream()
                .collect(Collectors.groupingBy(
                        e->e.getDepartment(),
                        Collectors.averagingDouble(
                                e->e.getSalary()
                        )));

        System.out.println(avgSalaryPerDepartment);






    }
}
