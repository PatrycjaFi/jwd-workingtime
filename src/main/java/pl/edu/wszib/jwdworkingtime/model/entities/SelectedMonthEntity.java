package pl.edu.wszib.jwdworkingtime.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "SelectedMonths")
public class SelectedMonthEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "month")
    private String month;


    public SelectedMonthEntity() {
    }

    public SelectedMonthEntity(String month) {
        this.month = month;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}