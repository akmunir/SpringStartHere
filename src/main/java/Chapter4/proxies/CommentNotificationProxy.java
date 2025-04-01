package Chapter4.proxies;

import Chapter4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
