package java_100;

import javax.swing.*;

public class CheckBox_79 {
    CheckBox_79(){
        JFrame jf=new JFrame("CheckBox Java_100");
        JCheckBox jcb=new JCheckBox("C++");
        jcb.setBounds(100,100,50,50);
        JCheckBox jcb2=new JCheckBox("Java",true);
        jcb2.setBounds(100,150,50,50);
        jf.add(jcb);
        jf.add(jcb2);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBox_79();
    }
}
