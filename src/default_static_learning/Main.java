package default_static_learning;


interface Animal{

    void eat();

    default void display()
    {
        System.out.println("This is default method ");
    }

    static void staticDisplay()
    {
        System.out.println("This is static method ");
    }
}
public class Main implements Animal{

    public static void  main(String[] args)
    {

        // create reference of Animal interface:

       Animal animal= new Main();

       // call abstract method :
       animal.eat();

       // call default method:
       animal.display();

       // call static method :
       Animal.staticDisplay();



    }

    @Override
   public void eat()
    {
        System.out.println("This is abstract method ");
    }
}
