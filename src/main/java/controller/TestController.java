package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(){
        return "hello";
    }
}
