import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("parrot",Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        Parrot parrot2 = context.getBean("parrot2",Parrot.class);
        System.out.println(parrot2.getName());

        Parrot parrot3 = context.getBean("parrot3",Parrot.class);
        System.out.println(parrot3.getName());
    }
}
