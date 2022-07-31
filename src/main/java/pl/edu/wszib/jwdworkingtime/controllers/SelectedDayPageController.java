package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedDayService;

@Controller
@RequestMapping
public class SelectedDayPageController {

    @Autowired
    SelectedDayService selectedDayService;

    @GetMapping({"/day-log", "/day-log/{day}"})
    public String showDayPage(@PathVariable(required = false) String day, Model model) {
        if (day !=null&&!day.isEmpty()) {
            selectedDayService.save(day);
        }


        String[] days = {
                "1", "2", "3", "4","5", "6", "7", "8", "9","10",
                "11", "12", "13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30","31",
        };

        model.addAttribute("days", days);
        return "dayLogPage";
    }

    }

