package arseneReaction;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class WengerReactionBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("温格对Lucas的机敏跑位感到很欣慰");
    }
}
