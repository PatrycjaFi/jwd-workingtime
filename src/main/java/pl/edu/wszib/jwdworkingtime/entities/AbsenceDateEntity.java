package pl.edu.wszib.jwdworkingtime.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "absence_dates")
public class AbsenceDateEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
