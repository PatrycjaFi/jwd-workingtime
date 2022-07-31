package pl.edu.wszib.jwdworkingtime.mappers;

import pl.edu.wszib.jwdworkingtime.model.SelectDateModel;
import pl.edu.wszib.jwdworkingtime.model.entities.SelectedDateEntity;

public class SelectDateMapper {
    public static SelectedDateEntity toEnity(SelectDateModel model) {
        SelectedDateEntity entity = new SelectedDateEntity();
        entity.setDate(model.getDate());
        return entity;
    }
}
