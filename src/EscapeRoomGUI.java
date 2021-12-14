import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoomGUI {
    JPanel panel;
    static JButton createNewProblem;
    static int enterAnswer1;


    static JLabel displayProblem;

    public EscapeRoomGUI() {
        JFrame frame = new JFrame("EscapeRoom");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JLabel TheKey = new JLabel("Hint: Everything is reversed here");
        JLabel displayProblem = new JLabel("15 + 5");

        JButton createNewProblem = new JButton("Next Problem");
        JButton add = new JButton("Addition");
        JButton sub = new JButton("Subtraction");
        JButton multi = new JButton("Multiply");
        JButton div = new JButton("Divide");

        createNewProblem.addActionListener(new EscapePanel.LastButton());
        add.addActionListener(new EscapePanel.Addition());
        sub.addActionListener(new EscapePanel.Subtraction());
        multi.addActionListener(new EscapePanel.Multiplication());
        div.addActionListener(new EscapePanel.Division());

        TheKey.setBounds(100, 25, 100, 75);


        panel = new EscapePanel();
        panel.add(TheKey);
        panel.add(displayProblem);
        panel.add(add);
        panel.add(sub);
        panel.add(multi);
        panel.add(div);
        panel.add(createNewProblem);
        frame.add(panel);
        panel.updateUI();
        frame.setVisible(true);
    }


    private static class EscapePanel extends JPanel {

        public EscapePanel() {
            setBackground(Color.CYAN);
        }


        public void paintComponent(Graphics g) {

            super.paintComponent(g);


        }

        private static class Addition implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                    JOptionPane.showMessageDialog(null, "You are Wrong!!");

            }


        }

        private static class Subtraction implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "You are Correct!!");
            }
        }

        private static class Multiplication implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "You are Wrong!!");
            }

        }

        private static class Division implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "You are Wrong!!");
            }


        }

        private static class LastButton implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent){
                enterAnswer1 = Integer.parseInt(JOptionPane.showInputDialog("What's the answer to the problem?"));
                if (enterAnswer1 == 10){
                    JOptionPane.showMessageDialog(null,"You are correct congrats on escaping!!!!");
                }
                else {
                    JOptionPane.showMessageDialog(null,"YOU'RE WRONG LEARNED THE RULES BUCKO!!");
                }
            }
        }
    }
}
