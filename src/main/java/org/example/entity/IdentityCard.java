package org.example.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class IdentityCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate dateCreation;

    @OneToOne
    private Employee employee;
}
