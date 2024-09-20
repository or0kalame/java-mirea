package Practise_3;

public class Product {
    int number_in_list;
    String name;
    String currency;

    double price;
    public Product(int number_in_list, String name, String currency, double price) {
        this.number_in_list = number_in_list;
        this.name = name;
        this.currency = currency;
        this.price = price;
    }

    public String getCurrency() {return currency;}
    public double getPrice() {return price;}


    @Override
    public String toString() {
        return "Product information:\n" + "Number: " + number_in_list + "\nName: " + name + "\nCurrency: " + currency + "\nPrice: " + price;
    }
}
