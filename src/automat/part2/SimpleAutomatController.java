package automat.part2;


public class SimpleAutomatController implements AutomatController {

    private Calculator calculator = new SimpleCalculator();

    @Override
    public CurrencyPacket calculateChange(AutomatRequest request) {
        int total = calculator.calculateTotal(request.enteredCoins);
        int totalChange = total - request.product.getPrice();
        return calculator.calculateChange(totalChange);
    }
}
