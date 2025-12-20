package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Calculate{
    int add(int x,int y);
}

public class Main{

    public static void main(String[] args)
    {
        /*
        Lambda expression implementation example code :
         */

        // Lambda expression wth Runnable interface :

        Runnable runnable=()->{System.out.println("Thread is started");};
        new Thread(runnable).start();

        // Lambda expression with custom functional interface:

        Calculate calculate=(int a,int b)->{return a+b ;};
       System.out.println( calculate.add(10,78));

       // Lambda expression with built-in functional interface :

        /*
       Predicate : returns boolean
       Predicate<Integer> isEven= n->n%2==0;
         */

        Predicate<Integer> isEven=n->n%2==0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));

        /*
        Function: return Input -> Output
        Function<String,Integer> length=s->s.length();
         */

        Function<String,Integer> length=s->s.length();
        System.out.println(length.apply("Hello Sir"));

        /*
        Consumer :
        Consumer<String> print=s->System.out.println(s)
         */

        Consumer<String> print=s->System.out.println(s);
        print.accept("Hello Sir");

        /*
        Supplier: no input
        Supplier<Double> random=Math.random();
         */

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

        /*
        Lambda with Collections :
        forEach()
         */

        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");

        fruits.forEach(s->System.out.println(s));





    }
}