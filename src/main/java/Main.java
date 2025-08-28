import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean(Person.class);

        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(person.getName());
        System.out.println(parrot.getName());

        System.out.println("Person "+person.getName()+" "+ person.getParrot());
    }
}
