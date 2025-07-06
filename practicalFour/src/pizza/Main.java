package pizza;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
/*
 * @Author Sipho Gwala
 * 2022-06-01
 * @Module Comp102
 * */
public class Main {

    public static void main(String[] args) throws IOException {
        JFrame myFrame = new JFrame();
        myFrame.setSize(1024, 768);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setTitle("MyPanel");
        myFrame.add(new PizzaPanel());
        myFrame.setVisible(true);

    }
}
