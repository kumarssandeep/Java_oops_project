package automat.part2;

public enum Currency {
    INR5(5), INR10(10),  INR20(20), INR50(50), INR100(100);

    private int value;

    Currency(int value){
        this.value = value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }

    public int getValue(){
        return this.value;
    }
}
