package SpringCoreLearn.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by fanji on 2017/1/9.
 */
public class Iphone implements MobilePhone {
    private App app;

    public void setApp(App app) {
        this.app = app;
    }
    //构造函数注入
    @Autowired
    public Iphone(App app){
        this.app = app;
    }
}
