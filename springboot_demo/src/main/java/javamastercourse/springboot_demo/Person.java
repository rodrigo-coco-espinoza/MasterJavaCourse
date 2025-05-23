package javamastercourse.springboot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    
    @Value("25")
    private int age;
    private Computer assignedComputer;

    
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public Computer getAssignedComputer() {
        return assignedComputer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setAssignedComputer(Computer assignedComputer) {
        this.assignedComputer = assignedComputer;
    }


    public void code()
    {
        System.out.println("Coding...");
        assignedComputer.compile();
    }


}
