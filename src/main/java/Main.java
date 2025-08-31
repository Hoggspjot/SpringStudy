import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Before");

        // В этой строке Spring должен предоставить ссылку на бин
        //CommentService поэтому Spring кго создает в этот момент
        CommentService c = context.getBean(CommentService.class);
        System.out.println("after");
    }
}
