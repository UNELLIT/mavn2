package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServTest {

    @Test
    public void testCountPestMonthsi() {
        FreelanceServ serv = new FreelanceServ();

        int actual = serv.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountPestMonthsi2() {
        FreelanceServ serv = new FreelanceServ();

        int actual = serv.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}