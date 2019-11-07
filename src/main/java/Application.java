import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerService service = appContext.getBean("customerService", CustomerService.class);


        System.out.println(service.findAll().get(0).getFirstname());
        System.out.println((service.findAll().get(0).getLastname()));
    }
}
