package pl.edu.wszib.jwdworkingtime.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDayEntity;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;


@Repository
public interface SelectedDayRepository extends JpaRepository<SelectedDayEntity, Integer> {

    SelectedDayEntity findFirstByDay(String day);
}
