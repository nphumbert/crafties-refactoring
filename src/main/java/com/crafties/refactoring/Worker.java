package com.crafties.refactoring;

import java.math.BigDecimal;

public class Worker extends Employee {

    public Worker(BigDecimal baseSalary) {
        super(baseSalary, BigDecimal.ZERO);
    }


    @Override
    public BigDecimal computeSalary() {
        return baseSalary();
    }
}
