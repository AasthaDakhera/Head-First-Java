//Output : Screen 4

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class A_Fragment {
    public static void main(String[] args){
        A_Fragment T1=new A_Fragment();
        T1.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        panel.add(button);
        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
