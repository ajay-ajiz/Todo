package com.webapp.springboot.Todo.todoHome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class todoHomeController {

    private TodoService todoservice =new TodoService();
    @RequestMapping(value = "home")

    public String home(ModelMap model){
        List<Todo> list =todoservice.findlistbyusername("ajay");
        model.addAttribute("todos",list);

        return "todolist2";
    }


}
