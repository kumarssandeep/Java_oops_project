package automat.part1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        AutomatInterface machineInterface = null; //TODO

        machineInterface.displayProducts();

        String selectedProduct = scanner.nextLine();
        machineInterface.selectProduct(Integer.parseInt(selectedProduct));

        machineInterface.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();

        int[] enteredCoins = {};
        machineInterface.enterCoins(enteredCoins);

        machineInterface.displayChangeMessage();

    }
}
