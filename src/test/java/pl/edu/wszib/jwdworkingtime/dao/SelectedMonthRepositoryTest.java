package pl.edu.wszib.jwdworkingtime.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectedMonthRepositoryTest {

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
    void testFetchDate() {
        SelectedMonthEntity dateEntity = selectedMonthRepository.findFirstByMonth(MONTH1);
        assertEquals(MONTH1, dateEntity.getMonth(), "Incorrect month has been found.");
    }

}