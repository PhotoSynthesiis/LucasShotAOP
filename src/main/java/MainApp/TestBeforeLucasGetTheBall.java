package MainApp;

import arseneReaction.WengerReactionBeforeAdvice;
import interfaces.PlayerAction;
import lucasAction.LucasAction;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeLucasGetTheBall {
    public static void main(String[] args) {
        PlayerAction playerAction = new LucasAction();
        BeforeAdvice beforeAdvice = new WengerReactionBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(playerAction);
        proxyFactory.addAdvice(beforeAdvice);

        PlayerAction proxy = (PlayerAction) proxyFactory.getProxy();
        proxy.run();
    }
}
