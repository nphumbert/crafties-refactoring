package com.crafties.refactoring;

import java.math.BigDecimal;

public class Employee {

    private final EmployeeType employeeType;
    private final BigDecimal baseSalary;
    private final BigDecimal bonus;

    public Employee(EmployeeType employeeType, BigDecimal baseSalary, BigDecimal bonus) {
        this.employeeType = employeeType;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public BigDecimal computeSalary() {
        switch (employeeType) {
            case WORKER:
                return baseSalary;
            case SALESMAN:
                return baseSalary.add(bonus);
            case MANAGER:
                return baseSalary.add(baseSalary.multiply(new BigDecimal("0.10")));
            default:
                throw new IllegalStateException("Unknown employee type: " + employeeType);
        }
    }

    public BigDecimal baseSalary() {
        return baseSalary;
    }

    public BigDecimal bonus() {
        return bonus;
    }
}
