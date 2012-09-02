package AOP_Test_Classes;

import SellerAndWaiter.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDynamicPointcut {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter2");
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
        waiter.serveTo("Peter");
        waiter.greetTo("Peter");
    }
}
