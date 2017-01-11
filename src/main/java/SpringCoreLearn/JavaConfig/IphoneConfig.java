package SpringCoreLearn.JavaConfig;

import org.springframework.context.annotation.Bean;
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
    public AopAction aopActionp(){
        return new AopAction();
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
