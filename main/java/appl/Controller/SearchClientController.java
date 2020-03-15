package appl.Controller;

//import appl.model.Product;
import appl.model.Client;

// import hw.model.Searching;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SearchClientController {
    @GetMapping("/clientsearch")
    public String greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        model.addAttribute("clientsearch", new Client());
        //if clientService.findByName("Harry Potter").forEach(System.out::println);
        return "clientsearch";
    }
}

//clientService.findByName("Harry Potter").forEach(System.out::println);