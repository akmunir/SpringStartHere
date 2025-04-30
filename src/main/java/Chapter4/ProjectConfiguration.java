package Chapter4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
@ComponentScan(basePackages =  {"Chapter4.proxies", "Chapter4.repositories", "Chapter4.services"})
public class ProjectConfiguration {
}

