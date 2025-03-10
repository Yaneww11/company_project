package org.example.dto;

import java.time.LocalDate;

public class CompanyDto {
    private String name;
    private LocalDate foundationDate;
    private double initialCapital;

    public CompanyDto(String name, LocalDate foundationDate, double initialCapital) {
        this.name = name;
        this.foundationDate = foundationDate;
        this.initialCapital = initialCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }
}
