package com.example.homepage;
import com.example.homepage.dao.PersonDao;
import com.example.homepage.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By xfj on 2018/11/15
 */
@Controller
public class TestController {
    @Autowired
    PersonDao personDao;
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping(value = {"/static"},method = RequestMethod.GET)
    public String loginPage(){
        return "index.html";
    }
}