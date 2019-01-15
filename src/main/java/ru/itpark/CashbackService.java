package ru.itpark;

public class CashbackService {
    public int calculateCashback(int sumCategory1, int sumCategory2, int sumCategory3) {
        int percentCashBackCategory1 = 1;
        int percentCashBackCategory2 = 5;
        int percentCashBackCategory3 = 30;
        int maxCashback = 3_000;

        int resultCommon = (sumCategory1 * percentCashBackCategory1 + sumCategory2 * percentCashBackCategory2
                + sumCategory3 * percentCashBackCategory3) / 100;

        if (resultCommon > maxCashback) {
            return maxCashback;

        }
        return resultCommon;

    }

}
