package spring_demo;

import java.beans.ConstructorProperties;

public class Person {
    private int age;
    private Laptop assignedLaptop;

    public Person()
    {
        System.out.println("Person object created");
    }
    @ConstructorProperties({"age", "assignedLaptop"})
    public Person(int age, Laptop assignedLaptop)
    {
        this.age = age;
        this.assignedLaptop = assignedLaptop;
        System.out.println("Person object created with age: " + age);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Laptop getAssignedLaptop() {
        return assignedLaptop;
    }
    public void setAssignedLaptop(Laptop assignedLaptop) {
        this.assignedLaptop = assignedLaptop;
    }
    
    public void code()
    {
        System.out.println("Coding...");
        assignedLaptop.compile();
    }
