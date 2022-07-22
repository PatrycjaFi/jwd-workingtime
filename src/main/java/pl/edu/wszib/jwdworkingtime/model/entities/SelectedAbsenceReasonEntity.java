package pl.edu.wszib.jwdworkingtime.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "SelectedAbsences")
public class SelectedAbsenceReasonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "reason")
    private String reason;

    public SelectedAbsenceReasonEntity() {
    }

    public SelectedAbsenceReasonEntity(String reason) {
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
}
