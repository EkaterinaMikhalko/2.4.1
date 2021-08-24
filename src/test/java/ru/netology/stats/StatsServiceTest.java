package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void calculateSum() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.sum(purchases);

        long actual = service.sum(purchases);
        long expected = 180;
        assertEquals (expected, actual);

    }

    @Test
    void averageAmount() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.average (purchases);

        long actual = service.average(purchases);
        long expected = 15;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnMonthMax() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.sum(purchases);

        long actual = service.monthWithMax(purchases);
        long expected = 8;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnMonthMin() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.sum(purchases);

        long actual = service.monthWithMin(purchases);
        long expected = 9;
        assertEquals (expected, actual);

    }
    @Test
    void shouldReturnMoreThanAverage() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.sum(purchases);

        long actual = service.monthCountMoreThenAverage(purchases);
        long expected = 5;
        assertEquals (expected, actual);

    }

    @Test
    void shouldReturnLessThanAverage() {

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService ();
        service.sum(purchases);

        long actual = service.monthCountLessThenAverage(purchases);
        long expected = 5;
        assertEquals (expected, actual);

    }



}
