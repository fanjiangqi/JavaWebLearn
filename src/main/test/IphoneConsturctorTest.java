import SpringCoreLearn.JavaConfig.App;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by fanjiangqi on 2017/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringCoreLearn.JavaConfig.IphoneConfig.class)
public class IphoneConsturctorTest {
    private App app;
    @Autowired
    public IphoneConsturctorTest(App app){
        this.app = app;
    }
}
