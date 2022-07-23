package pl.edu.wszib.jwdworkingtime.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wszib.jwdworkingtime.dao.SelectedEmployeeRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;

@Controller
@RequestMapping
public class SelectedEmployeeController {

    @Autowired
    SelectedEmployeeRepository selectedEmployeeRepository;

    @GetMapping({"/employee-log", "/employee-log/{employee}"})
    public String showEmployeePanel(@PathVariable(required = false) String employee, Model model) {

        if(employee !=null&&!employee.isEmpty()) {
            selectedEmployeeRepository.save(new SelectedEmployeeEntity(employee));
        }

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
