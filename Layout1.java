import javax.swing.*;
import java.awt.*;

public class Layout1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Absulutely Positioning");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        frame.setLayout(null);

        JButton Btn1 = new JButton("Button 1");
        Btn1.setBounds(50,50,150,40);

        JButton Btn2 = new JButton("Button 2");
        Btn2.setBounds(150,120,150,40);

        frame.add(Btn1);
        frame.add(Btn2);

        frame.setVisible(true);
    }
}