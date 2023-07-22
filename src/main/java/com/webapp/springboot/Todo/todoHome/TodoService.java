package com.webapp.springboot.Todo.todoHome;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
    public TodoService() {
        this.todos=todos;
    }

    public  static List<Todo> todos=new ArrayList<>();
     static {
        todos.add(new Todo(1,"ajay","java", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"ajay","spring", LocalDate.now().plusYears(1),false));

    }
    public List<Todo> findlistbyusername(String username){
        return todos;
    }

}
