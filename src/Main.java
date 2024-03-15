import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double itemCost;
        double shipCost;
        double total;
        System.out.print("Enter the price of your item: $");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextDouble()){
            itemCost = scan.nextDouble();
            if(itemCost < 0)
                System.out.println("Error: Invalid Input");
            else{
                if (itemCost < 100){
                    shipCost = (itemCost * 0.02);
                }
                else {
                    shipCost = 0;
                }
                total = itemCost + shipCost;
                System.out.println("Shipping Cost: $" + shipCost);
                System.out.print("Total Price: $" + total);
            }

        } else System.out.println("Error: Invalid Input");
    }
}