package services;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    Logger logger = Logger.getLogger(CommentService.class.getName());


    public String publishComment(Comment comment) {
        logger.info("Publishing comment " + comment.getText());
        return "SUCCESS";
    }

}
