package DynamicMethodMatcherPointcut;

import org.springframework.aop.ClassFilter;
import SellerAndWaiter.Waiter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();

    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                System.out.println("调用getClassFilter()对" + aClass.getName() + "做静态检查");
                return Waiter.class.isAssignableFrom(aClass);
            }
        };
    }

    @Override
    public boolean matches(Method method, Class clazz) {
        System.out.println("调用matches(method,clazz)对" + clazz.getName() + "." + method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    @Override
    public boolean matches(Method method, Class<?> aClass, Object[] args) {
        System.out.println("调用matches(method,clazz,object)对" + aClass.getName() + "." + method.getName() + "做动态检查");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
