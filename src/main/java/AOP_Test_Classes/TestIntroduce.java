package AOP_Test_Classes;

import interfaces.Monitorable;
import introduce.ForumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIntroduce {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
        ForumService forumService = (ForumService) ctx.getBean("forumService");

        forumService.removeForum(10);
        forumService.removeTopic(1022);

        Monitorable monitorable = (Monitorable) forumService;
        monitorable.setMonitorActive(true);

        forumService.removeForum(10);
        forumService.removeTopic(1022);
    }
}
