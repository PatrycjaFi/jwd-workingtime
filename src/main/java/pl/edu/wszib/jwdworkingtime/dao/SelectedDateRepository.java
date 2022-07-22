package pl.edu.wszib.jwdworkingtime.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;

@Repository
public interface SelectedDateRepository extends JpaRepository<SelectedDateEntity, Integer> {
    SelectedDateEntity findFirstByDate (String date);
}
