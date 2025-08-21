import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

    @Bean
    Parrot parrot2() {
        Parrot p2 = new Parrot();
        p2.setName("Mik");
        return p2;
    }

    @Bean
    Parrot parrot3() {
        Parrot p3 = new Parrot();
        p3.setName("Rik");
        return p3;
    }

}
