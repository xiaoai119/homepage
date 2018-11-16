package com.example.homepage;
import com.example.homepage.dao.PersonDao;
import com.example.homepage.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleafController {
    @Autowired
    PersonDao personDao;
    @RequestMapping(value = {"","/"})
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "xfj") String name,
                           Model model) {
        model.addAttribute("xname", name);

        Person xfj = new Person("徐方进");
        int i = personDao.create(xfj);
        System.out.println(i);
        return "index";
    }
}