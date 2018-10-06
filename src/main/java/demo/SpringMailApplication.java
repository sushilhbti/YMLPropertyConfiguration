package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;


@EnableConfigurationProperties(demo.MailProperties.class)
@SpringBootApplication
public class SpringMailApplication {


    public static void main(String[] args){

        ApplicationContext context = SpringApplication.run(SpringMailApplication.class,args);
        MailService mailService = context.getBean(MailService.class);
        mailService.printMailData();

//        @RequestMapping("/congig")
//                public String confrprint() {
//            ApplicationContext context = SpringApplication.run(SpringMailApplication.class,args);
//            MailService mailService = context.getBean(MailService.class);
//            //mailService.printMailData();
//
//             return mailService.printMailData();
//        }
    }
}
