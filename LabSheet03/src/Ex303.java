import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 =scanner.nextInt();
        System.out.print("Enter number2: ");
        int num2 =scanner.nextInt();
        System.out.print("Enter number3: ");
        int num3 =scanner.nextInt();

        //condition ? True:False
        System.out.println(num1==num2&&num2==num3 ? "All numbers are the same.":"All numbers arenot the same.");

        if (num1==num2&&num2==num3){
           System.out.println("All numbers are the same.");
        }else{
            System.out.println("All numbers are not same.");
        }







    }
}
