import controller.HelloController;
import controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


/**
 * Created by li_weia on 2017/5/26.
 */

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(new Object[]{HelloController.class, TestController.class}, args);
    }
}
