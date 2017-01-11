package SpringCoreLearn.JavaConfig;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by fanjiangqi on 2017/1/10.
 */
@Aspect
public class AopAction {
    @Pointcut("execution(** SpringCoreLearn.JavaConfig.WeiChat.sendMessage(..))")
    public void weiChatAopPerfor(){}
    @Before("weiChatAopPerfor()")
    public void beforSetMessage(){
        System.out.println("我准备发信息啦...");
    }
    @After("weiChatAopPerfor()")
    public void afterSetMessage(){
        System.out.println("发过信息啦...");
    }
}
