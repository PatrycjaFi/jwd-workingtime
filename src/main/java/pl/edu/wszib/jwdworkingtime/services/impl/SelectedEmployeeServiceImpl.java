package pl.edu.wszib.jwdworkingtime.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdworkingtime.dao.SelectedEmployeeRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedEmployeeService;

import java.util.List;

@Service
public class SelectedEmployeeServiceImpl implements SelectedEmployeeService {
   @Autowired
    SelectedEmployeeRepository selectedEmployeeRepository;

    @Override
    public void save(String employee) {
        selectedEmployeeRepository.save(new SelectedEmployeeEntity(employee));
    }

    @Override
    public void save(SelectedEmployeeEntity selectedEmployeeEntity) {
        selectedEmployeeRepository.save(selectedEmployeeEntity);
    }

    @Override
    public List<SelectedEmployeeEntity> getAllData() {
        return (List<SelectedEmployeeEntity>)selectedEmployeeRepository.findAll();
    }
}
