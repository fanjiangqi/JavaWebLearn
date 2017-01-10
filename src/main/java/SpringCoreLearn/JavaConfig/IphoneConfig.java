package SpringCoreLearn.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by fanjiangqi on 2017/1/9.
 */
@Configuration
//@ComponentScan
@EnableAspectJAutoProxy
public class IphoneConfig {
    @Bean
    public WeiChatAop weiChatAop(){
        return new WeiChatAop();
    }
    @Bean
    public WeiChat weiChat(){
        return new WeiChat();
    }
    @Bean
    public Qq qq(){
        return new Qq();
    }

}
