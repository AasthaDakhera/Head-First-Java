//Output : Screen 6

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class B_Fragment {
    public static void main(String[] args){
        B_Fragment T1=new B_Fragment();
        T1.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
