package com.example.homepage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleafController {
    @RequestMapping(value = {"","/"})
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "xfj") String name,
                           Model model) {
        model.addAttribute("xname", name);
        return "index";
    }


}