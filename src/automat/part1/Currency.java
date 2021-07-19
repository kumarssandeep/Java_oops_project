package automat.part1;

public enum Currency {
    FIVE_CENTS(5), TEN_CENTS(10),  TWENTY_CENTS(20), FIFTY_CENTS(50), HUNDRED_CENTS(100);

    private int value;

    Currency(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
