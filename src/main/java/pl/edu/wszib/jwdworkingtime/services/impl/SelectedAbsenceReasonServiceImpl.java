package pl.edu.wszib.jwdworkingtime.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.jwdworkingtime.dao.SelectedAbsenceReasonRepository;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedAbsenceReasonEntity;
import pl.edu.wszib.jwdworkingtime.services.SelectedAbsenceReasonService;

import java.util.List;

@Service
public class SelectedAbsenceReasonServiceImpl implements SelectedAbsenceReasonService {
    @Autowired
    SelectedAbsenceReasonRepository selectedAbsenceReasonRepository;

    @Override
    public void save(String reason) {
        selectedAbsenceReasonRepository.save(new SelectedAbsenceReasonEntity(reason));
    }

    @Override
    public void save(SelectedAbsenceReasonEntity selectedAbsenceReasonEntity) {
selectedAbsenceReasonRepository.save(selectedAbsenceReasonEntity);
    }

    @Override
    public List<SelectedAbsenceReasonEntity> getAllData() {
        return (List<SelectedAbsenceReasonEntity>)selectedAbsenceReasonRepository.findAll();
    }
}
