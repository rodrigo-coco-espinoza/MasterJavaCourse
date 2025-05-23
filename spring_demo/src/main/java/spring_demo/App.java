package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_demo.config.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
        // Using XML configuration
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        // Person person = context.getBean("person", Person.class);
        // System.out.println("Person age: " + person.getAge());
        // person.code();

        // Desktop desktop = context.getBean(Desktop.class);

        // Using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();
    }
}
