package Controller;

import Model.SearchModel;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SearchController {
    @GetMapping("/search")
    public String greetingForm(Model model) {
        //model.addAttribute("greeting", new Greeting());
        //model.addAttribute("search", new SearchModel());
        return "search";
    }
        /*@PostMapping("/gresearch")
        public String gettingInfo(@ModelAttribute SearchModel searchModel) {
            if (searching.searchInfor()!=null){
                return "/search";}
            return "/unsearch";
        }*/


}


