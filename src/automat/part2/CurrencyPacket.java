package automat.part2;

public class CurrencyPacket {
    private int INR5;
    public int INR10;
    public int INR20;
    public int INR50;
    public int INR100;

    public CurrencyPacket(int... enteredCoins) {
        this.setINR5(enteredCoins[0]);
        this.INR10 = enteredCoins[1];
        this.INR20 = enteredCoins[2];
        this.INR50 = enteredCoins[3];
        this.INR100 = enteredCoins[4];

    }


    public int getTotal(){
        int total = 0;
        total = total+ this.getINR5() * Currency.INR5.getValue();
        total = total+this.INR10 * Currency.INR10.getValue();
        total = total+this.INR20 * Currency.INR20.getValue();
        total = total+this.INR50 * Currency.INR50.getValue();
        total = total+this.INR100 * Currency.INR100.getValue();
        return total;
    }

    public int getINR5() {
        return INR5;
    }

    public void setINR5(int INR5) {
        this.INR5 = INR5;
    }
}
