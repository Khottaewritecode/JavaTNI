import java.text.DecimalFormat;
import java.util.Scanner;
public class lab203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product id :");
        String id = scanner.nextLine();

        System.out.print("Enter product name :");
        String product_name = scanner.nextLine();

        System.out.print("Enter product item :");
        int product_item =Integer.parseInt(scanner.nextLine());

        System.out.print("Enter price per item :");
        double price_per_item=Double.parseDouble(scanner.nextLine());

        System.out.println("-------------------------------------");
        System.out.println("Product name:" + product_name + " (" + id + ")");
        System.out.println("Product item:" + product_item + " (" + price_per_item + " baht/piece)");

        DecimalFormat frm = new DecimalFormat("#,###.00");
        double total_price = product_item*price_per_item;
        System.out.println("Total price:" + frm.format(total_price) + "baht");
    }
}
