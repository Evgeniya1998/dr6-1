package ru.netology.stats;

public class StatsService {

    public int SumOfAllSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;

    }

    public int AverageAmountOfSales(int[] sales) {

        int sum = SumOfAllSales(sales);

        int AverageValue = (sum / sales.length);
        return AverageValue;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int BelowAverageSales(int[] sales) {
        int numberOfMonths = 0;
        int AverageValue = AverageAmountOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageValue) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int AboveAverageSales(int[] sales) {
        int numberOfMonths = 0;
        int AverageValue = AverageAmountOfSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageValue) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

}
