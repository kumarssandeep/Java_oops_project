package automat.part2;



public class TextAutomatInterface implements AutomatInterface {

    private AutomatController controller = new SimpleAutomatController();
    private int selectedProduct;
    private CurrencyPacket change;


    @Override
    public void displayProducts() {
        System.out.println("                                              ");
        System.out.println(" *********************************************");
        System.out.println("              WELCOME, HELLO SIR!!          ");
        System.out.println(" *********************************************");
        System.out.println("       Products available in the shop:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 5 INR coins ,num of 10 INR coins ,num of 20 INR coins,num of 50 INR coins ,num of 100 INR coins");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter THREE 20 INR coins: 0,0,3,0,0");
        System.out.println("Please enter coins:");

    }

    @Override
    public void enterCoins(int... coins) {
        AutomatRequest request = new AutomatRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");

        System.out.println("Your change is :INR "+ change.getTotal()+" split as follows: ");

        System.out.println("                                              ");

        System.out.println("    INR 100 : "+ change.INR100);
        System.out.println("    INR 50: "+ change.INR50);
        System.out.println("    INR 20: "+ change.INR20);
        System.out.println("    INR 10: "+ change.INR10);
        System.out.println("    INR 5: "+ change.getINR5());

    }
}
