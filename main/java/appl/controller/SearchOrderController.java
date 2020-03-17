package appl.controller;


import appl.model.Order;


// import hw.model.Searching;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
//@ResponseBody
//@RestController
public class SearchOrderController {
    @GetMapping("/ordersearch")
    public String greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        model.addAttribute("ordersearch", new Order());
        return "ordersearch";
    }
    // @PostMapping("/productsearch")
    /*public String gettingInfo(@ModelAttribute Product product) {
        return "/unsearch";
    }*/
}


