package lesson_1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lesson_1")
public class ApplicationConfig {
    /*@Bean(name = "Lor")
    public Specialist specialist(){
        return new Lor();
    }*/
}
