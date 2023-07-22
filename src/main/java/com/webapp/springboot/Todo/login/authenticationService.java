package com.webapp.springboot.Todo.login;


import org.springframework.stereotype.Service;

@Service
public class authenticationService {
    public boolean Authentication(String name,String psw){
        if (name.equalsIgnoreCase("ajay") && psw.equalsIgnoreCase("123")) return true;
        else return false;
    }
}
