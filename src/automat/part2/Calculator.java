package automat.part2;

public interface Calculator {
    int calculateTotal(CurrencyPacket enteredCoins);
    CurrencyPacket calculateChange(int enteredByUserMoney);
}
