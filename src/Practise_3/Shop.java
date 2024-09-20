package Practise_3;
import java.util.*;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {new Product(1, "Computer", "USD", 1200),
                new Product(2, "Cap", "CNY", 700),
                new Product(3, "Gloves", "RUB", 2000)};

        System.out.println("Catalog");
        for (Product product : products) {
            System.out.println(product.toString() + '\n');
        }

        System.out.println("Choose your currency(RUB, USD, CNY, EUR):");
        String userCurrency = sc.nextLine();
        System.out.println("Choose your product from the catalog:");
        Product chosenProduct = products[sc.nextInt() - 1];

        String productCurrency = chosenProduct.getCurrency();
        double productPrice = chosenProduct.getPrice();
        Converter conveter = new Converter();

        if (userCurrency.equals("RUB")) {
            if (productCurrency.equals("USD")) {
                System.out.printf("Price in USD: %.2f\nPrice in RUB: %.2f", productPrice, conveter.convertUSDtoRUB(productPrice));
            }
            if (productCurrency.equals("CNY")) {
                System.out.printf("Price in CNY: %.2f\nPrice in RUB: %.2f", productPrice, conveter.convertCNYtoRUB(productPrice));
            }
            if (productCurrency.equals("RUB")) {
                System.out.printf("Price in RUB: %.2f", productPrice);
            }
        }

        if (userCurrency.equals("USD")) {
            if (productCurrency.equals("USD")) {
                System.out.printf("Price in USD: %.2f", productPrice);
            }
            if (productCurrency.equals("CNY")) {
                System.out.printf("Price in CNY: %.2f\nPrice in USD: %.2f", productPrice, conveter.convertCNYtoUSD(productPrice));
            }
            if (productCurrency.equals("RUB")) {
                System.out.printf("Price in RUB: %.2f\nPrice in USD: %.2f", productPrice, conveter.convertRUBtoUSD(productPrice));
            }
        }

        if (userCurrency.equals("CNY")) {
            if (productCurrency.equals("USD")) {
                System.out.printf("Price in USD: %.2f\nPrice in CNY: %.2f", productPrice, conveter.convertUSDtoCNY(productPrice));
            }
            if (productCurrency.equals("CNY")) {
                System.out.printf("Price in CNY: %.2f", productPrice);
            }
            if (productCurrency.equals("RUB")) {
                System.out.printf("Price in RUB: %.2f\nPrice in CNY: %.2f", productPrice, conveter.convertRUBtoCNY(productPrice));
            }
        }

    }

}
