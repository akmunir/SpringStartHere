package Chapter4.main;

import Chapter4.model.Comment;
import Chapter4.proxies.CommentNotificationProxy;
import Chapter4.proxies.EmailCommentNotificationProxy;
import Chapter4.repositories.CommentRepository;
import Chapter4.repositories.DBCommentRepository;
import Chapter4.services.CommentService;


public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotification = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotification);
        var comment = new Comment("Joe John", "Conquest from Invincible is freaky af");
        commentService.publishComment(comment);
    }
}
