package pl.edu.wszib.jwdworkingtime.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedAbsenceReasonEntity;

@Repository
public interface SelectedAbsenceReasonRepository extends JpaRepository<SelectedAbsenceReasonEntity, Integer> {
    SelectedAbsenceReasonEntity findFirstByReason(String reason);
}
