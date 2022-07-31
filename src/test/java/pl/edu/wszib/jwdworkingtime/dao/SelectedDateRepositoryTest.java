package pl.edu.wszib.jwdworkingtime.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectedDateRepositoryTest {
//
//    public static final String DATE1 = "22.06.2022";
//
//    @Autowired
//    SelectedDateRepository selectedDateRepository;
//
//    @BeforeEach
//    void setUp() {
//        SelectedDateEntity dateEntity1 = new SelectedDateEntity(DATE1);
//        assertNull(dateEntity1.getId());
//        selectedDateRepository.save(dateEntity1);
//        assertNotNull(dateEntity1.getId());
//    }
//
//    @Test
//    void testFetchDate() {
//        SelectedDateEntity dateEntity = selectedDateRepository.findFirstByDate(DATE1);
//        assertEquals(DATE1, dateEntity.getDate(), "Incorrect date has been found.");
//    }
}