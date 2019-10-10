package fr.wildcodeschool.wildmail.controller;

import fr.wildcodeschool.wildmail.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailListController {

    @PostMapping("/mail/list")
    public String maillist(Model out,
                           @RequestParam(name="email") String userMail) {
        out.addAttribute("email", userMail);
        out.addAttribute("listemail", getEmailsFromDatabase(userMail));

        return "maillist";
    }

    public List<Email> getEmailsFromDatabase(String emailValue) {

        Email mail1 = new Email("michel@michmich.fr", emailValue,
                "C tro kwel", "mdr");
        Email mail2 = new Email("beb@ggdu31.fr", emailValue,
                "C'est beber", "N'oubli pas l'été dernier");

        List<Email> mails = new ArrayList<>();
        mails.add(mail1);
        mails.add(mail2);

        return mails;
    }

    // TODO : path variable
}
