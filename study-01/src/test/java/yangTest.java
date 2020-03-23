import com.yang.Yang;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: create by Bingda
 * @version: v1.0
 * @description: PACKAGE_NAME
 * @date:2020/3/20
 **/
public class yangTest {

    @Test
    public void firstTest() {
        ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");

        Yang yang = (Yang) con.getBean("yang");
        yang.log();
    }
}
