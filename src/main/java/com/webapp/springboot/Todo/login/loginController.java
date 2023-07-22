package com.webapp.springboot.Todo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    authenticationService auth =new authenticationService();
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String displayLoginPage(){
        return "Login";
    }
    @RequestMapping(value = "login", method= RequestMethod.POST)

    public String Login( ModelMap model, @RequestParam  String name,@RequestParam String password){
        Logger logger  = LoggerFactory.getLogger(getClass());
        if (auth.Authentication(name,password)) {
            model.put("name", name);
            model.put("password", password);

            return "welcome";

        }
        model.put("ErrorMessage","please enter  valid credentials");
        return "Login";
    }
}
