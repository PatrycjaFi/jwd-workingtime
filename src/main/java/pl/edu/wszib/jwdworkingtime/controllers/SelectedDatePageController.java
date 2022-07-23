package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedDateService;

@Controller
public class SelectedDatePageController {

    @Autowired
    SelectedDateService selectedDateService;


    @GetMapping("date-log")
    public String showDatePage(String date) {

        selectedDateService.save(date);
        return "dateLogPage";
    }
}
