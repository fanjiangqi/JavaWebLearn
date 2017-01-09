package SpringCoreLearn.JavaConfig;

import org.springframework.stereotype.Component;

/**
 * Created by fanjiangqi on 2017/1/9.
 */
@Component
public class WeiChat implements App {
    public void display() {
        System.out.println("我是微信");
    }
}
