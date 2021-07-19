package automat.part1;


public class AutomatRequest {
    public Product product;
    public CurrencyPacket enteredCoins;

    public AutomatRequest(int selectedProduct, int... enteredCoins){
        // TODO Complete in step 3
        this.product = null;
        this.enteredCoins = new CurrencyPacket(enteredCoins);
    }
}
