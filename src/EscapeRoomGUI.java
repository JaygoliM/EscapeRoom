import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;

public class EscapeRoomGUI {
        JPanel panel;
    static  JButton createNewProblem;



    public EscapeRoomGUI(){
        JFrame frame = new JFrame("EscapeRoom");
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JButton Add = new JButton("Subtract");
        JButton Sub = new JButton("Add");
        JButton Multi = new JButton("Divide");
        JButton Divide = new JButton("Multiply");
        JLabel enterResult;



        panel = new EscapePanel();
        double Num1 = Math.random();
        double Num2 = Math.random();


        panel.add(Add);
        panel.add(Sub);
        panel.add(Multi);
        panel.add(Divide);

        frame.add(panel);
        frame.setVisible(true);
    }

private class EscapePanel extends JPanel{

        public EscapePanel(){
            setBackground(Color.BLUE);
        }
    public void paintComponent(Graphics g){

        super.paintComponent(g);


    }
}

    public static double Addition(double Num1, double Num2){
        return Num1 + Num2;
    }

    public static double Division(double Num1, double Num2){
        return Num1 / Num2;
    }

    public static double Multiply(double Num1, double Num2){
        return Num1 * Num2;
    }

    public static double Subtract(double Num1, double Num2){
        return Num1 - Num2;
    }
}
