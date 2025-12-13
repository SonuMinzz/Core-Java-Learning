package method_overriding;

class Animal {

    void eats()
    {
        System.out.println("Animal eats");
    }
}
public class Cow extends Animal
{
    void eats()
    {
        System.out.println(".Cow eats grass");
    }

    public static void main(String[] args) {

        Animal animal=new Cow(); //animal reference is pointing to object method_overloading.Main hence resolving during runtime.
        animal.eats();


    }
}
