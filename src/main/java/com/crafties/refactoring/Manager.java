package com.crafties.refactoring;

import java.math.BigDecimal;

public class Manager extends Employee {

    public Manager(BigDecimal baseSalary) {
        super(baseSalary, BigDecimal.ZERO);
    }

    @Override
    public BigDecimal computeSalary() {
        return baseSalary().add(baseSalary().multiply(new BigDecimal("0.10")));
    }
}
