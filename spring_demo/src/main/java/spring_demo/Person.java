package spring_demo;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    
    @Value("21")
    private int age;   
    private Computer assignedComputer;

    public Person()
    {
        System.out.println("Person object created");
    }
    @ConstructorProperties({"age", "assignedComputer"})
    public Person(int age, Computer assignedComputer)
    {
        this.age = age;
        this.assignedComputer = assignedComputer;
        System.out.println("Person object created with age: " + age);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getAssignedComputer() {
        return assignedComputer;
    }
    @Autowired // Autowire the computer bean
    //@Qualifier("laptop") // Use class name with lowercase first letter
    public void setAssignedComputer(Computer assignedComputer) {
        this.assignedComputer = assignedComputer;
    }
    
    public void code()
    {
        System.out.println("Coding...");
        assignedComputer.compile();
    }
}
