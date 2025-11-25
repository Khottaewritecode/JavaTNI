import javax.swing.*;

public class lab205 {
    public static void main(String[] args) {

        int minutes =Integer.parseInt(JOptionPane.showInputDialog("Input minutes:"));

        JOptionPane.showMessageDialog(null,minutes+" minutes is "+ (minutes/60)+ " hour "+ (minutes%60)+ " minutes ");
    }
}
