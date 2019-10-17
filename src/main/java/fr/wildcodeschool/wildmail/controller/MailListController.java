package fr.wildcodeschool.wildmail.controller;

import fr.wildcodeschool.wildmail.repository.EmailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailListController {

    @PostMapping("/mail/list")
    public String maillist(Model out,
                           @RequestParam(name = "email") String userMail) {
        EmailRepository repository = new EmailRepository();

        out.addAttribute("email", userMail);
        out.addAttribute("listemail", repository.findAll());

        return "maillist";
    }

    // /mail/{id} path variable
    // /mail/?id=$value request params
    @GetMapping("/mail")
    public String showEmail(Model out, @RequestParam(name = "id",
                                                required = true,
                                                defaultValue = "0"
                                        ) Long id
    ) {
        EmailRepository repository = new EmailRepository();
        out.addAttribute("emailValues", repository.findById(id));

        return "emailinfos";
    }

    // TODO : path variable
}
