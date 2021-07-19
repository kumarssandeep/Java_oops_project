package automat.part1;


public interface Calculator {

    int calculateTotal(CurrencyPacket enteredCoins);
    CurrencyPacket calculateChange(int enteredByUserMoney);

}
