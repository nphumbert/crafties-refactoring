package com.crafties.refactoring;

import java.math.BigDecimal;

public class Salesman extends Employee {

    public Salesman(BigDecimal baseSalary, BigDecimal bonus) {
        super(baseSalary, bonus);
    }

    @Override
    public BigDecimal computeSalary() {
        return baseSalary().add(bonus());
    }
}
