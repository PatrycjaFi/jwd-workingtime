package pl.edu.wszib.jwdworkingtime.entities;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "initials")
    private String initials;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_details_id")
    private EmployeeTimeDetailsEntity employeeTimeDetailsEntityEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public EmployeeTimeDetailsEntity getEmployeeTimeDetailsEntityEntity() {
        return employeeTimeDetailsEntityEntity;
    }

    public void setEmployeeTimeDetailsEntityEntity(EmployeeTimeDetailsEntity employeeTimeDetailsEntityEntity) {
        this.employeeTimeDetailsEntityEntity = employeeTimeDetailsEntityEntity;
    }
}
