package arseneReaction;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class WengerReactionMethodnterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("温格庆祝Lucas进球");
        invocation.proceed();
        System.out.println("温格与Lucas拥抱");
        return null;
    }
}
