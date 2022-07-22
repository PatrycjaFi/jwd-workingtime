package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SelectedAbsenceReasonController {

    @GetMapping("/absence-log")
    public String showAbsenceLogPage(Model model) {
        String[] reasons = {
                "Planned holiday",
                "Maternity/Paternity leave",
                "Holiday leave on demand",
                "Time off to care for a dependent",
                "Special leave",
                "Sick leave",
        };

        model.addAttribute("reasons", reasons);
        return "absenceLogPage";
    }
}
