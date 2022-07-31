package pl.edu.wszib.jwdworkingtime.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwdworkingtime.dao.SelectedMonthRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedEmployeeEntity;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SelectedMonthServiceImplTest {

    public static final String MONTH1 = "May";

    @Autowired
    SelectedMonthRepository selectedMonthRepository;

    @BeforeEach
    void setUp() {
        SelectedMonthEntity monthEntity = new SelectedMonthEntity(MONTH1);
        assertNull(monthEntity.getId());
        selectedMonthRepository.save(monthEntity);
        assertNotNull(monthEntity.getId());
    }

    @Test
    void save() {
        selectedMonthRepository.save(new SelectedMonthEntity(MONTH1));
    }

    @Test
    void testSave() {
        SelectedMonthEntity monthEntity = new SelectedMonthEntity(MONTH1);
        selectedMonthRepository.save(monthEntity);
    }

    @Test
    void getAllData() {
        SelectedMonthEntity selectedMonthEntity = selectedMonthRepository.findFirstByMonth(MONTH1);
        assertEquals(MONTH1, selectedMonthEntity.getMonth(), "Incorrect month has been found.");
    }

}