package abstraction;

abstract class Car{

    abstract void color();

    void category()
    {
        System.out.println("Sports Car");
    }
}

public class Main extends Car{
    @Override
    void color() {
        System.out.println("Car color is red");
    }

    public static void main(String[] args)
    {
        Main ob=new Main();
        ob.color();
        ob.category();

    }

}
