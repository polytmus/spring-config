import me.qebs.spring.demo.test.TestBean;
import me.qebs.spring.demo.test.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @create 2018-04-19 15:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void test() {
        System.out.println(testBean.getContent());
    }
}
