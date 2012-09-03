package ComposablePointcut;

import Waiter_ControlFlowPointcut.WaiterDelegate;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class GreetingComposablePointcut {
    public Pointcut getIntersectionPointcut() {
        ComposablePointcut composablePointcut = new ComposablePointcut();                //创建一个复合切点
        Pointcut pointcut = new ControlFlowPointcut(WaiterDelegate.class, "service");     //创建一个流程切点
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();  //创建一个方法名切点
        nameMatchMethodPointcut.addMethodName("greetTo");
        return composablePointcut.intersection(pointcut).intersection((MethodMatcher) nameMatchMethodPointcut);   //将两个切点进行交集操作
    }
}
