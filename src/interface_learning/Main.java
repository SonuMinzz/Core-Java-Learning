//Multiple Inheritance:

package interface_learning;


interface Father{

   void fatherTraits();

}

interface Mother{

     void motherTraits();
}



public class Main implements Father,Mother{


    @Override
    public void fatherTraits() {
        System.out.println("Father Traits");
    }

    @Override
    public void motherTraits() {
        System.out.println("Mother Traits");

    }

    public static void main(String[] args)
    {
        Main ob=new Main();
        ob.fatherTraits();
        ob.motherTraits();
    }

}
