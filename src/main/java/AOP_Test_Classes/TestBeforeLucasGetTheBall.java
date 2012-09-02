package AOP_Test_Classes;

import arseneReaction.WengerReactionBeforeAdvice;
import interfaces.PlayerAction;
import lucasAction.LucasAction;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeLucasGetTheBall {
    public static void main(String[] args) {
        PlayerAction playerAction = new LucasAction();      // target
        BeforeAdvice beforeAdvice = new WengerReactionBeforeAdvice();    //advice

        ProxyFactory proxyFactory = new ProxyFactory();   //proxyFactory
        proxyFactory.setTarget(playerAction);
        proxyFactory.addAdvice(beforeAdvice);

        PlayerAction proxy = (PlayerAction) proxyFactory.getProxy();
        proxy.run();
    }
}
