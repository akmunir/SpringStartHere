package Chapter4.repositories;

import Chapter4.model.Comment;

public class DBCommentRepository implements CommentRepository {
    public void storeComment(Comment comment) {
        System.out.println("Storing the comment: " + comment);
    }
}
