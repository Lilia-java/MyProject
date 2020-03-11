package appl.Controller;

import appl.model.Product;


// import hw.model.Searching;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class SearchProductController {
    @GetMapping("/productsearch")
    public String greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        model.addAttribute("productsearch", new Product());
        return "productsearch";
    }
   // @PostMapping("/productsearch")
    /*public String gettingInfo(@ModelAttribute Product product) {
        return "/unsearch";
    }*/
}


