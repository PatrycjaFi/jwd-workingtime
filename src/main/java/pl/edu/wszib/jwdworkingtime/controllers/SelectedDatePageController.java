package pl.edu.wszib.jwdworkingtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.jwdworkingtime.dao.SelectedDateRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;

import java.util.List;

@Controller
public class SelectedDatePageController {

    private final SelectedDateRepository selectedDateRepository;

    public SelectedDatePageController(SelectedDateRepository selectedDateRepository) {
        this.selectedDateRepository = selectedDateRepository;
    }

    @GetMapping("date-log")
    public String showDatePage(Model model) {
        List<SelectedDateEntity> dates = selectedDateRepository.findAll();
        model.addAttribute("dates", dates);
        return "dateLogPage";
    }
}
