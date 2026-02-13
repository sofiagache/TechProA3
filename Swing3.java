import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");

        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked");
            }
        });

        frame.add(button);
        frame.setSize(700, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
