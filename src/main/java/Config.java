import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
            //Монтаж бинов путем передачи параметра
    //в метод с аннотацией @Bean
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        //передаем параметр метода , а не вызываем другой метод
        p.setParrot(parrot);
        return p;
    }

}
