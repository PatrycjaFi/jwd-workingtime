package pl.edu.wszib.jwdworkingtime.services;

import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;

import java.util.List;

public interface SelectedEmployeeService {
    void save(String employee);
        void save(SelectedEmployeeEntity selectedEmployeeEntity);
    List<SelectedEmployeeEntity> getAllData();
}
