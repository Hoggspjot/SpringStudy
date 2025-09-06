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

    @Around(value = "@annotation(services.ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) {
        try {
            logger.info("Logging aspect : Calling the intercepted method");
            Object returnedValue = joinPoint.proceed();
            logger.info("Logging Aspect : Method executed and returned: " + returnedValue);
            return returnedValue;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
