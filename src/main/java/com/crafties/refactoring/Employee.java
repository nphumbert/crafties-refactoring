package com.crafties.refactoring;

import java.math.BigDecimal;

public abstract class Employee {

    private final BigDecimal baseSalary;
    private final BigDecimal bonus;

    public Employee(BigDecimal baseSalary, BigDecimal bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public abstract BigDecimal computeSalary();

    public BigDecimal baseSalary() {
        return baseSalary;
    }

    public BigDecimal bonus() {
        return bonus;
    }
}
