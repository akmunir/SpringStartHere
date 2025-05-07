package Chapter5;
import Chapter5.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.model.Comment;
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        Comment comment = new Comment("Joe", "demo comment");
        service.publishComment(comment);

    }
}
