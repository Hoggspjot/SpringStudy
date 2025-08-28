import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean("parrot2", Parrot.class);

        System.out.println(person.getName());
        System.out.println(parrot.getName());

        System.out.println("beans.Person "+person.getName()+" "+ person.getParrot());
    }
}
