package spring_demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public Desktop()
    {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiling in desktop...");
    }

}
