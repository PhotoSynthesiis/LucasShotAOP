package staticMethodMatcherPointcutAdvisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        System.out.println(obj.getClass().getName() + "." + method.getName());
        String clientName = (String) args[0];
        System.out.println("How are you! Mr." + clientName);
    }
}
