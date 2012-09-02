package AOP_Test_Classes;

import arseneReaction.WengerReactionAfterReturningAdvice;
import interfaces.PlayerAction;
import lucasAction.LucasAction;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestAfterReturningLucasShotInaccurately {
    public static void main(String[] args) {
        PlayerAction target = new LucasAction();
        AfterReturningAdvice afterReturningAdvice = new WengerReactionAfterReturningAdvice();
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(afterReturningAdvice);

        factory.setTarget(target);

        PlayerAction proxy = (PlayerAction) factory.getProxy();
        proxy.cry();
    }

}
