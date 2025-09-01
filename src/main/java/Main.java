
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.Comment;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        CommentService cs = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Vasya");

       String value = cs.publishComment(comment);
       logger.info(value);
    }
}
