package u.pankratova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import u.pankratova.CSV;
import u.pankratova.model.Person;

@Controller
public class PersonController {

    @GetMapping("/addPerson")
    public String addPerson(Model model){
        model.addAttribute("person", new Person());
        return "addPerson";
    }

    @PostMapping("/addPerson")
    public String addPersonSubmit(@ModelAttribute Person person){
        String [] information = {
                person.getSurname(),
                person.getName(),
                person.getPatronymic(),
                String.valueOf(person.getAge()),
                String.valueOf(person.getSalary()),
                person.getEmail(),
                person.getJob()
        };

        CSV.saveRecord(information);

        return "addPersonResult";
    }



    @GetMapping("/findPerson")
    public String findPerson(Model model){
        model.addAttribute("person", new Person());
        return "findPerson";
    }

    @PostMapping("/findPerson")
    public String findPersonSubmit(@ModelAttribute Person person) {

        if (CSV.findRecord(person) != null){
            return "/personFound";
        } else
            return "/personNotFound";

    }
}
