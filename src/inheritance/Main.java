//Hybrid inheritance:

package inheritance;

class GrandFather{

    void grandFatherTraits()
    {
        System.out.println("grand Father Traits");
    }
}

class Father extends GrandFather{

    void FatherTraits()
    {
        System.out.println(" Father Traits");
    }
}

class Son extends Father{
    void sonFeatures()
    {
       System.out.println("Son own feature");
    }


}

class Daughter extends Father{

    void daughterFeatures()
    {
        System.out.println("Daughter own feature");
    }
}

public class Main {


    public static void main(String[] args )
    {
        Father father=new Father();
        father.grandFatherTraits(); //single inheritance

        //son extends father and daughter extends father(hierarchical inheritance)
        Son son=new Son();
        son.FatherTraits();

        Daughter daughter=new Daughter();
        daughter.FatherTraits();

        //When both combined hybrid:

        son.grandFatherTraits();
        daughter.grandFatherTraits();


    }

}
