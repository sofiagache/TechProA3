import javax.swing.*;

public class GridLayout1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout (2x2)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        frame.setLayout(new java.awt.GridLayout(2,2));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));

        frame.setVisible(true);


    }
}