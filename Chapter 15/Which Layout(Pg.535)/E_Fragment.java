//Output : Screen 3

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class E_Fragment {
    public static void main(String[] args){
        E_Fragment T1=new E_Fragment();
        T1.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}