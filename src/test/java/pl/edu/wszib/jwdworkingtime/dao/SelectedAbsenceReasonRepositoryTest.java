package pl.edu.wszib.jwdworkingtime.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedAbsenceReasonEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SelectedAbsenceReasonRepositoryTest {

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
    void testFetchData() {
        SelectedAbsenceReasonEntity selectedAbsenceReasonEntity = selectedAbsenceReasonRepository.findFirstByReason(REASON_1);
       assertEquals(REASON_1, selectedAbsenceReasonEntity.getReason(), "Wrong reason has been found.");
    }


}