package org.example.entity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToMany(mappedBy = "employees")
    private Set<Event> events;
    @OneToOne(mappedBy = "employee")
    private IdentityCard identityCard;
}
