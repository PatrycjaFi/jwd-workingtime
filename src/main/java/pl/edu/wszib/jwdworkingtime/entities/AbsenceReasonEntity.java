package pl.edu.wszib.jwdworkingtime.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "absence_reasons")
public class AbsenceReasonEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "reason")
    private String reason;

    @ManyToMany
    @JoinTable(name = "absence_details", joinColumns = @JoinColumn(name = "reason_id"),
    inverseJoinColumns = @JoinColumn(name = "date_id"))
    private Set<AbsenceDateEntity> absenceDates;

    public Long getId() {
        return id;
    }


    public String getReason() {
        return reason;
    }

    public Set<AbsenceDateEntity> getAbsenceDates() {
        return absenceDates;
    }
}
