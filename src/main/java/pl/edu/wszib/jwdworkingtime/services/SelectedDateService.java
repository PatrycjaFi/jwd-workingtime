package pl.edu.wszib.jwdworkingtime.services;

import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;
import java.util.List;

public interface SelectedDateService {
void save(String date);
void save(SelectedDateEntity selectedDateEntity);
List<SelectedDateEntity> getAllData();
}
