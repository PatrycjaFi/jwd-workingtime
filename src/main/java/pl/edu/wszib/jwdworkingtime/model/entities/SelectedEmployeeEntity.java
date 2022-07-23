package pl.edu.wszib.jwdworkingtime.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "SelectedEmployees")
public class SelectedEmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "employee")
    private String employee;


    public SelectedEmployeeEntity() {
    }

    public SelectedEmployeeEntity(String employee) {
        this.employee = employee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}

