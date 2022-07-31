package pl.edu.wszib.jwdworkingtime.services;

import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDayEntity;

import java.util.List;

public interface SelectedDayService {
    void save(String day);
    void save(SelectedDayEntity selectedDayEntity);
    List<SelectedDayEntity> getAllData();
}
