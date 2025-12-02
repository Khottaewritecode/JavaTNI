import javax.swing.*;

public class Ex305 {
    public static void main(String[] args) {
        int score =Integer.parseInt(JOptionPane.showInputDialog("Enter your Score"));

        while (score<0||score>100){
            score =Integer.parseInt(JOptionPane.showInputDialog("Invalid score!!\nEnter your score:"));
        }
        if (score>=50){
            JOptionPane.showMessageDialog(null,"pass");
        }else{
            JOptionPane.showMessageDialog(null,"fail");

        }
    }
}
