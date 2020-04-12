package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long middleSales(long[] purchases) {
        long sum = sumSales(purchases);
        long middleSum = sum / purchases.length;
        return middleSum;
    }

    public long maxSalesNumberMonth(long[] purchases) {
        long currentMax = purchases[0];
        int numMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (currentMax <= purchases[i]) {
                currentMax = purchases[i];
                numMonth = i + 1;
            }
        }
        return numMonth;
    }

    public long minSalesNumberMonth(long[] purchases) {
        long currentMin = purchases[0];
        int numMonth = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (currentMin >= purchases[i]) {
                currentMin = purchases[i];
                numMonth = i + 1;
            }
        }
        return numMonth;
    }

    public long underMiddleSales(long[] purchases) {
        long middleSum = middleSales(purchases);
        long amountMonthMin = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < middleSum) {
                amountMonthMin++;
            }
        }
        return amountMonthMin;
    }

    public long upperMiddleSales(long[] purchases) {
        long middleSum = middleSales(purchases);
        long amountMonthMax = 0;

        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > middleSum) {
                amountMonthMax++;
            }
        }
        return amountMonthMax;
    }

}
