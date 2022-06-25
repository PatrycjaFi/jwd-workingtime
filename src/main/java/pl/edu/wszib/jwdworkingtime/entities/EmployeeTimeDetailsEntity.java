package pl.edu.wszib.jwdworkingtime.entities;

import javax.persistence.*;

@Entity
@Table(name = "time_details")
public class EmployeeTimeDetailsEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "time_details")
    private String workingTimeDetails;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkingTimeDetails() {
        return workingTimeDetails;
    }

    public void setWorkingTimeDetails(String workingTimeDetails) {
        this.workingTimeDetails = workingTimeDetails;
    }
}
