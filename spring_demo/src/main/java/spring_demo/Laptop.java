package spring_demo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype") // This bean will be created every time it is requested
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
