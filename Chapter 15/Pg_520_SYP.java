//If the code above were modified to the code below,
//what would the GUI look like?

import javax.swing.*;
import java.awt.*;
public class Pg_520_SYP {
    public static void main(String[] args) {
        Pg_520_SYP gui = new Pg_520_SYP();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        JButton buttonThree = new JButton("huh?");
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(buttonThree);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
