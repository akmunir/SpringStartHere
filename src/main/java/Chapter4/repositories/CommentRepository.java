package Chapter4.repositories;
import Chapter4.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
