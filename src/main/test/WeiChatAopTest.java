import SpringCoreLearn.JavaConfig.App;
import SpringCoreLearn.JavaConfig.WeiChat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fanjiangqi on 2017/1/10.
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringCoreLearn.JavaConfig.IphoneConfig.class)
public class WeiChatAopTest {
    @Autowired
    private App weiChat;
   /* @Autowired
    private AopAction weiChatAop;*/
    @Test
    public void actionTest(){
        weiChat.sendMessage();
    }

}
