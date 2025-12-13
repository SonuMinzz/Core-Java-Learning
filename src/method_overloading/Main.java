package method_overloading;/*
Compile-time Polymorphism: Method OverLoading
 */

public class Main {

      int sum(int a,int b)
        {
            return a+b;
        }

        double sum(double a,double b)
        {
            return a+b;
        }

        int sum(int a,int b,int c)
        {
            return a+b+c;
        }

        public static void main(String[] args) {

            Main ob=new Main();
            System.out.println(ob.sum(2,5));
            System.out.println(ob.sum(12.5,15.5));
            System.out.println(ob.sum(2,4,6));

        }
    }

