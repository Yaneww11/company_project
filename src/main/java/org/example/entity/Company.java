package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate foundationDate;
    private double initialCapital;
    @OneToMany(mappedBy = "company")
    private Set<Employee> employees;

    public Company() {
    }

    public Company(String name, LocalDate foundationDate, double initialCapital){
        this.name = name;
        this.foundationDate = foundationDate;
        this.initialCapital = initialCapital;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundationDate=" + foundationDate +
                ", initialCapital=" + initialCapital +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }
}
