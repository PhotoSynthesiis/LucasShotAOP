package arseneReaction;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class WengerReactionAfterReturningAdvice implements AfterReturningAdvice{
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("温格骂出了F开头的脏话表达强烈不满");
    }
}
