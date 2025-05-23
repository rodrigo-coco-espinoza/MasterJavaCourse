package spring_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_demo.Desktop;

@Configuration
public class AppConfig {
    
    @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }
}
