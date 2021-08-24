package ru.netology.stats;

public class StatsService {
    public long sum(long[] purchases) {

        long result = 0;
        for (long purchase : purchases) {
            result = result + purchase;
        }
        return result;

    }

    public long average(long[] purchases) {
        long sum = sum(purchases);

        return sum / purchases.length;

    }

    public long monthWithMax(long[] purchases) {
        int result = 0;
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max){
                max = purchase;
            }

        }
        int month = 1;
        int monthWithMax = 0;

        for (long purchase: purchases){
            if (purchase == max){
                monthWithMax = month;
            }
            month += 1;
        }
        return monthWithMax;

    }

    public long monthWithMin(long[] purchases) {
        int result = 0;
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min){
                min = purchase;
            }

        }
        int month = 1;
        int monthWithMin = 0;

        for (long purchase: purchases){
            if (purchase == min){
                monthWithMin = month;
            }
            month += 1;
        }
        return monthWithMin;

    }

    public long monthCountMoreThenAverage(long[] purchases) {
       long average = average(purchases);
       long count = 0;
       for (long purchase : purchases){
           if (purchase > average){
               count++;
           }
       }
       return count;
    }

    public long monthCountLessThenAverage(long[] purchases) {
        long average = average(purchases);
        long count = 0;
        for (long purchase : purchases){
            if (purchase < average){
                count++;
            }
        }
        return count;
    }
}
