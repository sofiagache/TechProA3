import javax.swing.*;

public class BoxLayout1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Vertical Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel = new JPanel();


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
