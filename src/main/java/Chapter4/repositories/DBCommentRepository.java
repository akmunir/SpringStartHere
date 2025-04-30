package Chapter4.repositories;

import Chapter4.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    public void storeComment(Comment comment) {
        System.out.println("Storing the comment: " + comment);
    }
}
