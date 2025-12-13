package encapsulation;


class Display{

    private String name;

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name=name;
    }
}

public class Student extends Display {


    public static void main(String[] args)
    {
        Student student=new Student();
      // System.out.println(student.name); //since name is private access is restricted(this is encapsulation)
        //we want getter and setter controlled access;
        student.setName("Rohan");
        System.out.println(student.getName());

    }


}
