package Chapter4.services;

import Chapter4.model.Comment;
import Chapter4.proxies.CommentNotificationProxy;
import Chapter4.repositories.CommentRepository;

public class CommentService {
    private final CommentNotificationProxy commentNotification;
    private final CommentRepository commentRepository;
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotification) {
        this.commentNotification = commentNotification;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotification.sendComment(comment);
    }
}
