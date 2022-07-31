package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedMonthService;


@Controller
@RequestMapping
public class SelectedMonthPageController {

    @Autowired
    SelectedMonthService selectedDateService;

    @GetMapping({"/month-log", "/month-log/{month}"})
    public String showDatePage(@PathVariable(required = false) String month, Model model) {
        if (month !=null&&!month.isEmpty()) {
            selectedDateService.save(month);
        }


        String[] months = {
                "January", "February","March", "April", "May", "June", "July", "August",
                "September", "October","November", "December",
        };

        model.addAttribute("months", months);
        return "monthLogPage";
    }

    }

