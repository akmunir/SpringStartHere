package Chapter4.services;

import Chapter4.model.Comment;
import Chapter4.proxies.CommentNotificationProxy;
import Chapter4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Service
public class CommentService {
    private final CommentNotificationProxy commentNotification;
    private final CommentRepository commentRepository;
    @Autowired
    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotification) {
        this.commentNotification = commentNotification;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotification.sendComment(comment);
    }
}
