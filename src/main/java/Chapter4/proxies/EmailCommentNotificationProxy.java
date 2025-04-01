package Chapter4.proxies;

import Chapter4.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for the comment: " + comment);
    }
}
