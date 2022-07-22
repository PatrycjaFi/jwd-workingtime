package pl.edu.wszib.jwdworkingtime.mappers;

import pl.edu.wszib.jwdworkingtime.model.SelectedDateModel;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;

public class SelectedDateMapper {
    public static SelectedDateEntity toEntity(SelectedDateModel model) {
        SelectedDateEntity entity = new SelectedDateEntity();
        entity.setDate(model.getDate());
        return entity;
    }
}
