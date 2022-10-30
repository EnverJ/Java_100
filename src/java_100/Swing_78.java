package java_100;

import javax.swing.*;

public class Swing_78 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        JButton jb=new JButton("Click");
        jb.setBounds(100,100,50,50);
        jf.add(jb);// adding button in JFrame
        jf.setSize(400,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
