package SpringCoreLearn.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by fanji on 2017/1/10.
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IphoneConfig.class);
        WeiChat weiChat = context.getBean(WeiChat.class);
        weiChat.sendMessage();
        /*App app = context.getBean(Qq.class);
        app.display();*/
        context.close();
    }
}
