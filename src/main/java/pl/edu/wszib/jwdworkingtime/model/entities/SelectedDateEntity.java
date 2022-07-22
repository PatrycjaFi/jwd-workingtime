package pl.edu.wszib.jwdworkingtime.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "absence_dates")
public class SelectedDateEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "date")
    private String date;

    public SelectedDateEntity() {
    }
    public SelectedDateEntity(String date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
