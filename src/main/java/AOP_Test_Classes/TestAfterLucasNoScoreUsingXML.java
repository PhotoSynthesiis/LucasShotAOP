package AOP_Test_Classes;

import lucasAction.LucasAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAfterLucasNoScoreUsingXML {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
        LucasAction lucasAction = (LucasAction) ac.getBean("targetProxy");
        lucasAction.celebrate();
    }
}
