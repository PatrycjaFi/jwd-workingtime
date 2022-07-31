package pl.edu.wszib.jwdworkingtime.services;

import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;

import java.util.List;

public interface SelectedMonthService {
    void save(String month);
    void save(SelectedMonthEntity selectedMonthEntity);
    List<SelectedMonthEntity> getAllData();
}
