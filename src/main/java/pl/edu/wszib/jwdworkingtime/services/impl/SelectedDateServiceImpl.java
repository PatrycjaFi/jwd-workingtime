package pl.edu.wszib.jwdworkingtime.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdworkingtime.dao.SelectedDateRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedDateService;

import java.util.List;

@Service
public class SelectedDateServiceImpl implements SelectedDateService {
    @Autowired
    SelectedDateRepository selectedDateRepository;

    @Override
    public void save(String date) {
        selectedDateRepository.save(new SelectedDateEntity(date));
    }

    @Override
    public void save(SelectedDateEntity selectedDateEntity) {
        selectedDateRepository.save(selectedDateEntity);
    }

    @Override
    public List<SelectedDateEntity> getAllData() {
        return (List<SelectedDateEntity>)selectedDateRepository.findAll();
    }
}
