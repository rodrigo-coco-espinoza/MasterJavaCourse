package spring_demo;

public class Laptop  implements Computer{

    public Laptop()
    {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling in laptop...");
    }   
}
