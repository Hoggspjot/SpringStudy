
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        CommentService cs = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Vasya");

        cs.publishComment(comment);

    }
}
