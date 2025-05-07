package Chapter5;

import Chapter5.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Configuration
@Component
@ComponentScan(basePackages = {"Chapter5", "Chapter5.services"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
