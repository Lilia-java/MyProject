package ShopProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


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


