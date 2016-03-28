package com.crafties.refactoring;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.number.BigDecimalCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void should_get_base_salary_when_worker() {
        // given
        Employee worker = new Worker(new BigDecimal(1500));

        // when
        BigDecimal salary = worker.computeSalary();

        // then
        assertThat(salary, closeTo(new BigDecimal(1500), new BigDecimal(0.01)));
    }

    @Test
    public void should_get_base_salary_plus_bonus_when_salesman() {
        // given
        Employee salesman = new Salesman(new BigDecimal(1500), new BigDecimal(1000));

        // when
        BigDecimal salary = salesman.computeSalary();

        // then
        assertThat(salary, closeTo(new BigDecimal(2500), new BigDecimal(0.01)));
    }

    @Test
    public void should_get_base_salary_plus_10_percent_when_manager() {
        // given
        Employee manager = new Manager(new BigDecimal(1500));

        // when
        BigDecimal salary = manager.computeSalary();

        // then
        assertThat(salary, closeTo(new BigDecimal(1650), new BigDecimal(0.01)));
    }

}