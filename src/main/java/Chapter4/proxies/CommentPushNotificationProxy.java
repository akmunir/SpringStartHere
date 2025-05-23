package Chapter4.proxies;

import Chapter4.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending push notification for comment: "
                        + comment.toString());
    }
}
