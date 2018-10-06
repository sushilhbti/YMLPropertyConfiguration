package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MailService {

    @Autowired
    private demo.MailProperties mailProperties;

    public void  printMailData(){

        System.out.println();
        System.out.println("Mail TO = " + mailProperties.getTo());
        System.out.println("Host  = " + mailProperties.getTo());
        System.out.println("PORT  = " + mailProperties.getPort());
        System.out.println();

        System.out.println("Mail CC = " + String.join(",", mailProperties.getCc()));
        System.out.println("Mail CC = " + mailProperties.getBcc());
        System.out.println();

        System.out.println("User Name = " + mailProperties.getCredential().getUserName());
        System.out.println("Password = " + mailProperties.getCredential().getPassword());


    }
}
