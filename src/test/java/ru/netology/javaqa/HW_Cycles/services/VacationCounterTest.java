package ru.netology.javaqa.HW_Cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCounterTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")

    public void shouldCalcRestMonthWithDifferentValues(int expected, int income, int expenses, int restThreshold) {
        VacationCounterService service = new VacationCounterService();

        int actual = service.calculate(income, expenses, restThreshold);

        Assertions.assertEquals(expected, actual);
    }
}