package pl.edu.wszib.jwdworkingtime.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDayEntity;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectedDayRepositoryTest {

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
    void testFetchDate() {
        SelectedDayEntity dayEntity = selectedDayRepository.findFirstByDay(DAY1);
        assertEquals(DAY1, dayEntity.getDay(), "Incorrect day has been found.");
    }

}