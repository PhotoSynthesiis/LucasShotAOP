package introduce;

import interfaces.Monitorable;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {
    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<Boolean>();

    public void setMonitorStatusMap(boolean active) {
        monitorStatusMap.set(active);
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {     //该方法用于拦截目标类方法的调用
        Object obj = null;
        if (monitorStatusMap.get() != null && monitorStatusMap.get()) {
            PerformanceMonitor.begin(methodInvocation.getClass().getName() + "." +
                    methodInvocation.getMethod().getName());
            obj = super.invoke(methodInvocation);
            PerformanceMonitor.end();
        } else {
            obj = super.invoke(methodInvocation);
        }
        return obj;
    }

    @Override
    public void setMonitorActive(boolean active) {
    }
}
