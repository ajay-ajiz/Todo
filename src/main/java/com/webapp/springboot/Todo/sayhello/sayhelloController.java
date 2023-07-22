package com.webapp.springboot.Todo.sayhello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayhelloController   {

    @RequestMapping("/sayhelo")
    @ResponseBody
    public  String sayhelo(){
        return "helo world..!";
    }
    @RequestMapping("/demo-jsp")

    public String demo(){
        return "demo";
    }

}
