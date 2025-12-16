import javax.swing.*;

public class lab506 {

    public static void main(String[] args) {

        int number = Integer.parseInt(
                JOptionPane.showInputDialog("Enter an integer:")
        );

        while (number <= 1) {
            number = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Number must be more than 1 !!\nEnter an integer again:"
                    )
            );
        }

        if (is_prime_number(number)) {
            JOptionPane.showMessageDialog(null, number + " is Prime number");
        } else {
            JOptionPane.showMessageDialog(null, number + " is NOT Prime number");
        }
    }

    static boolean is_prime_number(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
