package AOP_Test_Classes;

import Waiter_ControlFlowPointcut.WaiterDelegate;
import SellerAndWaiter.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestControlFlowPointcut {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter3");
        WaiterDelegate waiterDelegate = new WaiterDelegate();
        waiterDelegate.setWaiter(waiter);
        waiterDelegate.service("Roy Singham");
    }
}
