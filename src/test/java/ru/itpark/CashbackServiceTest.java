package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateCashback() {
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashback(100, 0, 0);

            assertEquals(1,cashback);
        }
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashback(1_000_000,0,0);

            assertEquals(3_000,cashback);
        }
        {
            CashbackService service = new CashbackService();
            int cashback = service.calculateCashback(0, 0, 0);

            assertEquals(0,cashback);
        }

    }
}