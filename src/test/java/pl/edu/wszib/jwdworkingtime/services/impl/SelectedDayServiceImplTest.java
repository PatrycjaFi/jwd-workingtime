package pl.edu.wszib.jwdworkingtime.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwdworkingtime.dao.SelectedDayRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDayEntity;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SelectedDayServiceImplTest {

    public static final String DAY1 = "22";

    @Autowired
    SelectedDayRepository selectedDayRepository;

    @BeforeEach
    void setUp() {
        SelectedDayEntity dayEntity = new SelectedDayEntity(DAY1);
        assertNull(dayEntity.getId());
        selectedDayRepository.save(dayEntity);
        assertNotNull(dayEntity.getId());
    }

    @Test
    void save() {
        selectedDayRepository.save(new SelectedDayEntity(DAY1));
    }

    @Test
    void testSave() {
        SelectedDayEntity dayEntity = new SelectedDayEntity(DAY1);
        selectedDayRepository.save(dayEntity);
    }

    @Test
    void getAllData() {
        SelectedDayEntity selectedDayEntity = selectedDayRepository.findFirstByDay(DAY1);
        assertEquals(DAY1, selectedDayEntity.getDay(), "Incorrect month has been found.");
    }

}