package u.pankratova.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service()
public class SendMail implements IMail {

    @Autowired
    private JavaMailSender emailSender;

    public void sendMessage(String to, String text) {
        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setFrom("${spring.mail.username}");
        simpleMessage.setTo(to);
        simpleMessage.setText(text);

        try {
            emailSender.send(simpleMessage);
            System.out.println("---------------------------------------");
            System.out.println("The email has been sent!");
        } catch (MailException m) {
            System.out.println("---------------------------------------");
            System.out.println("The email was NOT sent");
            m.printStackTrace();
        }
    }
}
