package fr.wildcodeschool.wildmail.repository;

import fr.wildcodeschool.wildmail.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepository {

    // get all emails
    public List<Email> findAll() {
        return emails;
    }

    // get one email by id
    public Email findById(Long id) {
        for (Email email : emails) {
            if (id.equals(email.getId())) {
                return email;
            }
        }
        return null;
    }

    private static List<Email> emails = new ArrayList<Email>() {
        {
            add(new Email(0L, "michel@michmich.fr",
                    "bastien@wildcodeschool.fr",
                    "C tro kwel", "mdr"));
            add(new Email(1L, "beb@ggdu31.fr",
                    "bastien@wildcodeschool.fr",
                    "C'est beber", "N'oubli pas l'été dernier"));
        }
    };
}
