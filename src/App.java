import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Panel Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel container = new JPanel(new CardLayout());
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        // Create a button to switch to the second panel
        JButton switchButton = new JButton("Go to Blue Panel");
        redPanel.add(switchButton);
        JButton switchButton1 = new JButton("Go to Red Panel");
        bluePanel.add(switchButton1);

        // Add an ActionListener to the button
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) container.getLayout();
                cardLayout.show(container, "BluePanel");
            }
        });
        switchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) container.getLayout();
                cardLayout.show(container, "RedPanel");
            }
        });

        // Add panels to the container
        container.add(redPanel, "RedPanel");
        container.add(bluePanel, "BluePanel");

        // Add the container to the frame
        frame.add(container);

        // Show the first panel initially
        CardLayout cardLayout = (CardLayout) container.getLayout();
        cardLayout.show(container, "RedPanel");

        // Make the frame visible
        frame.setVisible(true);
    }
}
   