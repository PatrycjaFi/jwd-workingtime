package pl.edu.wszib.jwdworkingtime.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdworkingtime.dao.SelectedDayRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDayEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedDayService;

import java.util.List;

@Service
public class SelectedDayServiceImpl implements SelectedDayService {

    @Autowired
    SelectedDayRepository selectedDayRepository;


    @Override
    public void save(String day) {
        selectedDayRepository.save(new SelectedDayEntity(day));
    }

    @Override
    public void save(SelectedDayEntity selectedDayEntity) {
        selectedDayRepository.save(selectedDayEntity);
    }

    @Override
    public List<SelectedDayEntity> getAllData() {
        return (List<SelectedDayEntity>) selectedDayRepository.findAll();
    }
}
