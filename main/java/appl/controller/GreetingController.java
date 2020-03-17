package appl.controller;


import appl.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/*import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;*/

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.Scanner;


@Controller
//@ResponseBody
//@RestController
public class GreetingController  {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }


    /*@GetMapping("/greeting")
    public String greetingFormSearch(Model model) {
        Scanner myScanner = new Scanner(System.in);
        String sn;
        String info;
        myScanner.findInLine(sn);
        return "search";
    }
*/
}
