package services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
@Lazy
public class CommentService {

    private final CommentRepository commentRepository;


    @Autowired
    public CommentService(CommentRepository commentRepository) {
        System.out.println("CommentService instance created!");
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
