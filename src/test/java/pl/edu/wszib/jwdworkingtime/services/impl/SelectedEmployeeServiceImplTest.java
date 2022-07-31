package pl.edu.wszib.jwdworkingtime.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwdworkingtime.dao.SelectedEmployeeRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SelectedEmployeeServiceImplTest {

    public static final String EMPLOYEE_ONE = "Anna Nowak";
    public static final String EMPLOYEE_TWO = "Anna Kowalska";

    @Autowired
    SelectedEmployeeRepository selectedEmployeeRepository;

    @BeforeEach
    void setUp() {
        SelectedEmployeeEntity employeeEntity1 = new SelectedEmployeeEntity(EMPLOYEE_ONE);
        SelectedEmployeeEntity employeeEntity2 = new SelectedEmployeeEntity(EMPLOYEE_TWO);

        assertNull(employeeEntity1.getId());
        assertNull(employeeEntity2.getId());


        selectedEmployeeRepository.save(employeeEntity1);
        selectedEmployeeRepository.save(employeeEntity2);


        assertNotNull(employeeEntity1.getId());
        assertNotNull(employeeEntity2.getId());

    }

    @Test
    void save() {
        selectedEmployeeRepository.save(new SelectedEmployeeEntity(EMPLOYEE_ONE));
    }

    @Test
    void testSave() {
        SelectedEmployeeEntity employeeEntity1 = new SelectedEmployeeEntity(EMPLOYEE_ONE);
        selectedEmployeeRepository.save(employeeEntity1);
    }

    @Test
    void getAllData() {
        SelectedEmployeeEntity selectedEmployeeEntity = selectedEmployeeRepository.findFirstByEmployee(EMPLOYEE_ONE);
        assertEquals(EMPLOYEE_ONE,
                selectedEmployeeEntity.getEmployee(),
                "Incorrect employee name has been found.");

    }
}