package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedAbsenceReasonService;
import pl.edu.wszib.jwdworkingtime.services.SelectedEmployeeService;

@Controller
public class OverviewController {

    @Autowired
    SelectedAbsenceReasonService selectedAbsenceReasonService;
    SelectedEmployeeService selectedEmployeeService;


    public OverviewController(SelectedAbsenceReasonService selectedAbsenceReasonService, SelectedEmployeeService selectedEmployeeService) {
        this.selectedAbsenceReasonService = selectedAbsenceReasonService;
        this.selectedEmployeeService = selectedEmployeeService;

    }

    @GetMapping("/overview")
    public String showOverviewPage(Model model) {

        model.addAttribute("selectedAbsenceReasons", selectedAbsenceReasonService.getAllData());
        model.addAttribute("selectedEmployees", selectedEmployeeService.getAllData());


        return "overviewPage";
    }


}