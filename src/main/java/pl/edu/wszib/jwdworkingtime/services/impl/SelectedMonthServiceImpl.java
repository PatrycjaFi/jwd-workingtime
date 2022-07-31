package pl.edu.wszib.jwdworkingtime.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdworkingtime.dao.SelectedMonthRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedMonthEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedMonthService;

import java.util.List;

@Service
public class SelectedMonthServiceImpl implements SelectedMonthService {

    @Autowired
    SelectedMonthRepository selectedMonthRepository;


    @Override
    public void save(String month) {
        selectedMonthRepository.save(new SelectedMonthEntity(month));
    }

    @Override
    public void save(SelectedMonthEntity selectedMonthEntity) {
selectedMonthRepository.save(selectedMonthEntity);
    }

    @Override
    public List<SelectedMonthEntity> getAllData() {
        return (List<SelectedMonthEntity>) selectedMonthRepository.findAll();
    }
}
