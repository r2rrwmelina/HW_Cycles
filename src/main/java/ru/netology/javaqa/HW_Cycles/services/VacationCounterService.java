package ru.netology.javaqa.HW_Cycles.services;

public class VacationCounterService {

    public int calculate(int income, int expenses, int restThreshold) { // доход, траты, кол-во накоплений для отпуска
        int count = 0;
        int threshold = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold >= restThreshold) { // отдыхаем
                count++;
                threshold = (threshold - expenses) / 3;
            } else {
                threshold = threshold + income - expenses; // работаем
            }
        }
        return count; // количество отпускных месяцев
    }
}
