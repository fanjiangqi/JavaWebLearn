package SpringCoreLearn.JavaConfig;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by fanjiangqi on 2017/1/9.
 */
//@Component
//@Scope( proxyMode = ScopedProxyMode.TARGET_CLASS )
public class WeiChat implements App {
    public void display() {
        System.out.println("我是微信");
    }
    public void sendMessage(){
        System.out.println("发信息中...");
    }
}
