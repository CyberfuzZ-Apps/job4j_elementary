package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        while (amount + amount / 100 * percent > salary) {
            amount += amount / 100 * percent - salary;
            year++;
        }
        return year;
    }
}