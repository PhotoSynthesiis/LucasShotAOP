package AOP_Test_Classes;

import SellerAndWaiter.Waiter;
import Waiter_ControlFlowPointcut.WaiterDelegate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComposablePointcut {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter4");
        WaiterDelegate waiterDelegate = new WaiterDelegate();
        waiterDelegate.setWaiter(waiter);
        waiterDelegate.service("Lucas Podolski");
    }
}
