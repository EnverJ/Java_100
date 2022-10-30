package java_100;

import java.awt.*;

public class AddTextArea_76 {
    AddTextArea_76(){
        Frame f=new Frame();
        TextArea area=new TextArea("Welcome to Java_100");
        area.setBounds(10,30,300,300);
        f.add(area);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AddTextArea_76();
    }
}
