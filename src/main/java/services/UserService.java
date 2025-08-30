package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

@Component
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
