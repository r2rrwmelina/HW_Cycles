package ru.netology.javaqa.HW_Cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCounterTest {

    @Test
    public void shouldCalcThreeRestMonthsFromTask() { // пример из задания
        VacationCounterService service = new VacationCounterService();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcTwoMonthsFromTask() {
        VacationCounterService service = new VacationCounterService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
