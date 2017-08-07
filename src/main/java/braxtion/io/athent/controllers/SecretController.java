package braxtion.io.athent.controllers;


import braxtion.io.athent.models.Secret;
import braxtion.io.athent.repositiory.SecretRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecretController {

    @Autowired
    SecretRepository secretRepo;



    @RequestMapping(name = "/createSecret", method = RequestMethod.POST)
    public String createSecretForm(@RequestParam("body") String body) {
        Secret newSecret = new Secret();
        newSecret.setBody(body);
        secretRepo.save(newSecret);
        return "redirect:/";
    }
}
