package com.example.formtesterthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {


    @GetMapping("/addUser")
    public String sendForm(User user) {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm() {
        return "showMessage";
        }
}
