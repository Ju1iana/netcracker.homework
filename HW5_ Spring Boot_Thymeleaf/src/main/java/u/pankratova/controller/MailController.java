package u.pankratova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import u.pankratova.mail.IMail;
import u.pankratova.model.MailObject;


@Controller
public class MailController  {

    @GetMapping(value = "/sendmail")
    public String mailSender(Model model) {
        model.addAttribute("mailObject", new MailObject());
        return "sendmail";
    }

    @Autowired
    public IMail IMail;

    @PostMapping("/sendmail")
    public String mailSenderResult(@ModelAttribute MailObject mailObject) {

        IMail.sendMessage(mailObject.getTo(), mailObject.getText());
        return "sendmailresult";
    }
}
