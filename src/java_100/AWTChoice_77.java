package java_100;

import java.awt.*;

public class AWTChoice_77 {
    AWTChoice_77(){
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(100,100,85,85);
        c.add("Item 1 by java_100");
        c.add("Item 2 by Jva_100");
        c.add("Item 3 by Java_100");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTChoice_77();
    }
}
