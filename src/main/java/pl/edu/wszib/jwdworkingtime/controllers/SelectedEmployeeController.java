package pl.edu.wszib.jwdworkingtime.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.dao.SelectedEmployeeRepository;

@Controller
@RequestMapping
public class SelectedEmployeeController {


    @GetMapping("/employee-log")
    public String showEmployeePanel(Model model) {
        String[] employees = {
                "Anna Bąk",
                "Magdalena Kaczor",
                "Piotr Kowalski",
                "Marta Nowak",
                "Marek Wąs",
        };

        model.addAttribute("employees", employees);
        return "employeeLogPage";
    }
}
