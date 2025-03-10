package org.example.entity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private WorkPosition workPosition;
    @ManyToOne
    private Company company;
    @ManyToMany(mappedBy = "employees")
    private Set<Event> events;
    @OneToOne(mappedBy = "employee")
    private IdentityCard identityCard;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkPosition getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(WorkPosition workPosition) {
        this.workPosition = workPosition;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workPosition=" + workPosition +
                ", company=" + company +
                '}';
    }
}
