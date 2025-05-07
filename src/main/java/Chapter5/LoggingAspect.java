package Chapter5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());
    @Around("execution(void services.CommentService.publishComment())")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Before the method is called");
        joinPoint.proceed();
        logger.info("After the method is called");
    }
}
