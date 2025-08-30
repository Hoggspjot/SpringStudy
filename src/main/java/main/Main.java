package main;

import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Comment comment = new Comment();
        comment.setAuthor("Leo");
        comment.setText("Hello World");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
