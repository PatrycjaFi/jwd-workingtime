package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedAbsenceReasonService;

@Controller
@RequestMapping
public class SelectedAbsenceReasonController {

    @Autowired
    SelectedAbsenceReasonService selectedAbsenceReasonService;

    @GetMapping({"/absence-log", "/absence-log/{reason}"})
    public String showAbsenceLogPage(@PathVariable(required = false) String reason, Model model) {

        if (reason !=null&&!reason.isEmpty()) {
            selectedAbsenceReasonService.save(reason);
        }

        String[] reasons = {
                "Planned holiday",
                "Maternity or Paternity leave",
                "Holiday leave on demand",
                "Time off to care for a dependent",
                "Special leave",
                "Sick leave",
        };

        model.addAttribute("reasons", reasons);
        return "absenceLogPage";
    }
}
