package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.model.SelectDateModel;


@Controller
@RequestMapping
public class SelectedDatePageController {

    @GetMapping("/date-log")
    public String showDatePage(@ModelAttribute("selectDate") SelectDateModel selectDateModel) {

        return "dateLogPage";
    }

    }

