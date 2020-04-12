package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void sumSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void middleSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.middleSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesNumberMonth() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesNumberMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesNumberMonth() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesNumberMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void underMiddleSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.underMiddleSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void upperMiddleSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upperMiddleSales(purchases);
        assertEquals(expected, actual);
    }

}