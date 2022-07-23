package pl.edu.wszib.jwdworkingtime.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;

@Repository
public interface SelectedEmployeeRepository extends JpaRepository<SelectedEmployeeEntity, Integer> {
SelectedEmployeeEntity findFirstByEmployee(String employee);


}
