import com.me.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/6.
 */
public class Consumer {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");

        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");

        System.out.println(demoService.getPermissions(1L));

    }
}
