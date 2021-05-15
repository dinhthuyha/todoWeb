package com.example.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class todoController {
    List<Todo> todoList = new ArrayList<>();

    //chuyen den trang addTodo
    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());

        return "addTodo";
    }

    //lay dl khi post
    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        System.out.println(todo);
        todoList.add(todo);
        return "success";
    }

    //
    @GetMapping("/listTodo")
    public String listTodo(Model model){
        model.addAttribute("listTodo", todoList);
        return "listTodo";
    }
}
