import javax.swing.*;
import java.text.DecimalFormat;

public class lab206 {
    public static void main(String[] args) {
        final int buffetPrice = 299;
        int customer =Integer.parseInt(JOptionPane.showInputDialog(" How man customer? "));
        double priceTotal = (buffetPrice*customer);
        double priceNet = (buffetPrice*customer)+(priceTotal*7/100);
        DecimalFormat frm = new DecimalFormat(  " #,###.00 ");
        int coupon =Integer.parseInt(JOptionPane.showInputDialog(" Price with Net is "+frm.format(priceNet)+" baht. "+
                "\nHow much of discount(%) on your coupon? "));
        double discount = priceNet*coupon/100,discountPRice=priceNet-discount;

        double paid= Double.parseDouble(JOptionPane.showInputDialog(" Total price is "+frm.format(discountPRice)+" baht "+
                "\nEnter the amount the customer paid "));

        double change = paid-discount;
        JOptionPane.showMessageDialog(null," Total price is "+frm.format(discountPRice)+" baht "+
                "\nCustomer paid " +frm.format(paid)+" baht."+"\nGet change "+frm.format(change)+" baht ");
    }
}
