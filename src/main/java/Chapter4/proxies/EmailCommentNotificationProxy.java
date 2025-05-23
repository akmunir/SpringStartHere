package Chapter4.proxies;

import Chapter4.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for the comment: " + comment);
    }
}
