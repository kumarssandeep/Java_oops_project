package automat.part2;

public class SimpleCalculator implements Calculator{

    @Override
    public int calculateTotal(CurrencyPacket enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CurrencyPacket calculateChange(int amountMoneyToReturn) {
        CurrencyPacket change = new CurrencyPacket(new int[5]);
        int remainingAmount = amountMoneyToReturn;
        change.INR100 = remainingAmount / Currency.INR100.getValue();
        remainingAmount = remainingAmount % Currency.INR100.getValue();

        change.INR50 = remainingAmount / Currency.INR50.getValue();
        remainingAmount = remainingAmount % Currency.INR50.getValue();

        change.INR20 = remainingAmount / Currency.INR20.getValue();
        remainingAmount = remainingAmount % Currency.INR20.getValue();

        change.INR10 = remainingAmount / Currency.INR10.getValue();
        remainingAmount = remainingAmount % Currency.INR10.getValue();

        change.setINR5(remainingAmount / Currency.INR5.getValue());


        return change;
    }
}
