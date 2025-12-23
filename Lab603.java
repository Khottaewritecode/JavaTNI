import java.util.Random;
import java.util.Scanner;

public class Lab603 {

    public static void main(String[] args) {   // แก้ตรงนี้
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess (0-20): ");
        int guess = sc.nextInt();

        int[] numbers = random_array(); // สุ่มตัวเลข 10 ตัว
        int sameNumber = count_element(numbers, guess); // นับว่าซ้ำกี่ครั้ง

        if (sameNumber > 0) {
            System.out.println("Congratulation!! " + guess + " is an element in the array!!");
            if (sameNumber > 1) {
                System.out.println("Fantastic!!! It also appears more than once!!");
            }
        } else {
            System.out.println("Sorry, try again next time...");
            System.out.print("Here are the elements in the array: ");
            display_array(numbers);
        }

        sc.close();
    }

    public static int[] random_array() {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(21); // 0-20
        }
        return numbers;
    }

    static int count_element(int[] numbers, int userguessNum) {
        int count = 0;
        for (int num : numbers) {
            if (num == userguessNum) {
                count++;
            }
        }
        return count;
    }

    static void display_array(int[] number) {
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

