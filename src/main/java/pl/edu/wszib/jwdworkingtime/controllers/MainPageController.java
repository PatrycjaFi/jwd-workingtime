package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping()
public class MainPageController {

    @GetMapping
    public String showMainPage(Model model){
        model.addAttribute("name","Test");
        return "mainPage";
    }

}

