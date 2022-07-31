package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwdworkingtime.services.SelectedAbsenceReasonService;
import pl.edu.wszib.jwdworkingtime.services.SelectedDayService;
import pl.edu.wszib.jwdworkingtime.services.SelectedMonthService;
import pl.edu.wszib.jwdworkingtime.services.SelectedEmployeeService;

@Controller
public class OverviewController {

    @Autowired
    SelectedAbsenceReasonService selectedAbsenceReasonService;
    SelectedEmployeeService selectedEmployeeService;
SelectedMonthService selectedMonthService;
SelectedDayService selectedDayService;

    public OverviewController(SelectedAbsenceReasonService selectedAbsenceReasonService, SelectedEmployeeService selectedEmployeeService, SelectedMonthService selectedMonthService, SelectedDayService selectedDayService) {
        this.selectedAbsenceReasonService = selectedAbsenceReasonService;
        this.selectedEmployeeService = selectedEmployeeService;
        this.selectedMonthService = selectedMonthService;
        this.selectedDayService = selectedDayService;
    }

    @GetMapping("/overview")
    public String showOverviewPage(Model model) {

        model.addAttribute("selectedAbsenceReasons", selectedAbsenceReasonService.getAllData());
        model.addAttribute("selectedEmployees", selectedEmployeeService.getAllData());
        model.addAttribute("selectedMonths", selectedMonthService.getAllData());
        model.addAttribute("selectedDays", selectedDayService.getAllData());

        return "overviewPage";
    }

}
