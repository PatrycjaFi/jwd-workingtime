package pl.edu.wszib.jwdworkingtime.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;


@Repository
public interface SelectedMonthRepository extends JpaRepository<SelectedMonthEntity, Integer> {

    SelectedMonthEntity findFirstByMonth(String month);
}
