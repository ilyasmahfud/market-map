package com.example.demo.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPresenter {

    @GetMapping("/")
    public String login(Model model){ return "home";}
}
