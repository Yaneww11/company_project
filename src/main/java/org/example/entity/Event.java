package org.example.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    private Set<Employee> employees;
}
