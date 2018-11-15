package com.example.homepage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created By xfj on 2018/11/15
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
    @RequestMapping(value = {"/static"},method = RequestMethod.GET)
    public String loginPage(){
        return "index.html";
    }
}