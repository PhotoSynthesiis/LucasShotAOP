package AOP_Test_Classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SellerAndWaiter.Seller;
import SellerAndWaiter.Waiter;

public class TestStaticMethodMatcherPointcutAdvisor {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        Waiter waiter = (Waiter) ctx.getBean("waiter");
        Seller seller = (Seller) ctx.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("John");
    }
}
