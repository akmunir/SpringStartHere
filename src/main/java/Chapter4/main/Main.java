package Chapter4.main;

import Chapter4.ProjectConfiguration;
import Chapter4.model.Comment;
import Chapter4.proxies.CommentNotificationProxy;
import Chapter4.proxies.EmailCommentNotificationProxy;
import Chapter4.repositories.CommentRepository;
import Chapter4.repositories.DBCommentRepository;
import Chapter4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var comment = new Comment("Joe John", "Conquest from Invincible is goated");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
