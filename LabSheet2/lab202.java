import java.text.DecimalFormat;
import java.util.Scanner;
public class lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1:");
        double num1 =Double.parseDouble(scanner.nextLine());

        System.out.print("Enter number 2:");
        double num2 =Double.parseDouble(scanner.nextLine());
        DecimalFormat frm = new DecimalFormat("#,###");
        System.out.println("\nSummation = "+frm.format(num1+num2));
        System.out.println("Subtraction = "+frm.format(num1-num2));
        System.out.println("Multiplication = "+frm.format(num1*num2));
        System.out.println("Division = "+(num1/num2));
        System.out.println("Modulus = "+frm.format(num1%num2));
    }
}


