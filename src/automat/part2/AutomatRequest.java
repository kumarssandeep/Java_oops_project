package automat.part2;

public class AutomatRequest {
    public Product product;
    public CurrencyPacket enteredCoins;

    public AutomatRequest(int selectedProduct, int... enteredCoins){
        this.product = Product.valueOf(selectedProduct);
        this.enteredCoins = new CurrencyPacket(enteredCoins);
    }
}
