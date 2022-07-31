package pl.edu.wszib.jwdworkingtime.services.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwdworkingtime.dao.SelectedAbsenceReasonRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedAbsenceReasonEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedAbsenceReasonService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SelectedAbsenceReasonServiceImplTest {

    public static final String REASON_1 = "Planned holiday";
    public static final String REASON_2 = "Sick leave";

    @Autowired
    SelectedAbsenceReasonRepository selectedAbsenceReasonRepository;

    @BeforeEach
    void setUp() {
        SelectedAbsenceReasonEntity selectedAbsenceReason1 = new SelectedAbsenceReasonEntity(REASON_1);
        SelectedAbsenceReasonEntity selectedAbsenceReason2 = new SelectedAbsenceReasonEntity(REASON_2);

        assertNull(selectedAbsenceReason1.getId());
        assertNull(selectedAbsenceReason2.getId());

        selectedAbsenceReasonRepository.save(selectedAbsenceReason1);
        selectedAbsenceReasonRepository.save(selectedAbsenceReason2);

        assertNotNull(selectedAbsenceReason1.getId());
        assertNotNull(selectedAbsenceReason2.getId());
    }

    @Test
    void save() {
        selectedAbsenceReasonRepository.save(new SelectedAbsenceReasonEntity(REASON_1));
    }

    @Test
    void testSave() {
        SelectedAbsenceReasonEntity selectedAbsenceReason1 = new SelectedAbsenceReasonEntity(REASON_1);
        selectedAbsenceReasonRepository.save(selectedAbsenceReason1);
    }

    @Test
    void getAllData() {
       SelectedAbsenceReasonEntity selectedAbsenceReasonEntity = selectedAbsenceReasonRepository.findFirstByReason(REASON_1);
        assertEquals(REASON_1, selectedAbsenceReasonEntity.getReason(), "Wrong reason has been found.");
    }
}