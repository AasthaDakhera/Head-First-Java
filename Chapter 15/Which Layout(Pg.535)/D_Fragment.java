//Output : Screen 2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class D_Fragment {
    public static void main(String[] args){
        D_Fragment T1=new D_Fragment();
        T1.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}