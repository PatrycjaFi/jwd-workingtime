package pl.edu.wszib.jwdworkingtime.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectedEmployeeRepositoryTest {

    public static final String EMPLOYEE_ONE = "Anna Nowak";
    public static final String EMPLOYEE_TWO = "Anna Kowalska";
    public static final String EMPLOYEE_THREE = "Jan Nowak";

    @Autowired
    SelectedEmployeeRepository selectedEmployeeRepository;

    @BeforeEach
    void setUp() {
        SelectedEmployeeEntity employeeEntity1 = new SelectedEmployeeEntity(EMPLOYEE_ONE);
        SelectedEmployeeEntity employeeEntity2 = new SelectedEmployeeEntity(EMPLOYEE_TWO);
        SelectedEmployeeEntity employeeEntity3 = new SelectedEmployeeEntity(EMPLOYEE_THREE);

        assertNull(employeeEntity1.getId());
        assertNull(employeeEntity2.getId());
        assertNull(employeeEntity3.getId());

        selectedEmployeeRepository.save(employeeEntity1);
        selectedEmployeeRepository.save(employeeEntity2);
        selectedEmployeeRepository.save(employeeEntity3);

        assertNotNull(employeeEntity1.getId());
        assertNotNull(employeeEntity2.getId());
        assertNotNull(employeeEntity3.getId());

    }

    @Test
    void testFetchData() {
    SelectedEmployeeEntity employeeEntity = selectedEmployeeRepository.findFirstByEmployee(EMPLOYEE_ONE);
        assertEquals(EMPLOYEE_ONE,
                employeeEntity.getEmployee(),
                "Incorrect employee name has been found.");
    }


}