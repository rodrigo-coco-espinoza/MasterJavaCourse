package javamastercourse.springboot_demo;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Compiling on a laptop...");
    }
}
