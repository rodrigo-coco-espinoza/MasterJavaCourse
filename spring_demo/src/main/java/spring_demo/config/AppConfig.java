package spring_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import spring_demo.Computer;
import spring_demo.Desktop;
import spring_demo.Laptop;
import spring_demo.Person;

@Configuration
@ComponentScan("spring_demo") // This will scan the package and its sub-packages for components

public class AppConfig {
    // Using @Configuration on the class indicates that this class contains Spring configuration and the configuration here is not necessary.
    
    // @Bean(name = {"desktop", "elTarro", "laMaquina"})
    // @Scope("prototype") // This bean will be created every time it is requested
    // public Desktop desktop() // The bean name is the method name by default
    // {
    //     return new Desktop();
    // }

    // @Bean
    // @Primary // This bean will be used by default when there are multiple candidates
    // public Laptop laptop()
    // {
    //     return new Laptop();
    // }
    
    // @Bean
    // public Person person(Computer computer) //Qualifer("laptop") to use a specific bean
    // {
    //     Person person = new Person();
    //     person.setAge(25);
    //     person.setAssignedComputer(computer);
        
    //     return person;
    // }
}


