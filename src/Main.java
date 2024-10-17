import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double shipCost;


        System.out.println(" Enter the price of your item: ");
        int price= in.nextInt();

        if (price >= 100)
        {
            shipCost = 0.0;
        }
        else {

            shipCost = price * 0.2;
        }

        double totalPrice = price + shipCost;

        System.out.println("The shipping cost on your item is: " + String.format("%.2f", shipCost));
        System.out.println("The total priceon your item is: " + String.format("%.2f", totalPrice));









    }
}