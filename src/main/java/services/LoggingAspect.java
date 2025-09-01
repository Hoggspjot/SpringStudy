package services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) {
        try {
            String methodName = joinPoint.getSignature().getName();
            Object[] arguments = joinPoint.getArgs();

            logger.info("Method "+ methodName +
                    " with parameters " + Arrays.asList(arguments)+
                    " will execute");

            Comment comment = new Comment();
            comment.setText("Some other text");

            Object[] newArgs = {comment};

            Object returnedByMethod = joinPoint.proceed(newArgs);
            logger.info("Method executed and returned - "+ returnedByMethod);
            return "FAILED";
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
