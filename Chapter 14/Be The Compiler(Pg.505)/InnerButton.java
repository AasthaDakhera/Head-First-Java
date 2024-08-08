import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerButton {
    private JButton button;
    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        button = new JButton("A");
        button.addActionListener(new ButtonListener());   //pass the class that implements addActionListener
        frame.getContentPane().add(
                BorderLayout.SOUTH, button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
    class ButtonListener implements ActionListener {     //ActionListener is an interface so it is implemented not extended
        public void actionPerformed(ActionEvent e) {
            if (button.getText().equals("A")) {
                button.setText("B");
            } else {
                button.setText("A");
            }
        }
    }
}

//Output : a button at south that toggles on click b/w "A" and "B"