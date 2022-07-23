package pl.edu.wszib.jwdworkingtime.services;

import pl.edu.wszib.jwdworkingtime.model.entities.SelectedAbsenceReasonEntity;
import java.util.List;

public interface SelectedAbsenceReasonService {
    void save(String reason);
    void save(SelectedAbsenceReasonEntity selectedAbsenceReasonEntity);
    List<SelectedAbsenceReasonEntity> getAllData();
}
