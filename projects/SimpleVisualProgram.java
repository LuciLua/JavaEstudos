import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class SimpleVisualProgram {
    public static void main(String[] args) {
        // create a new JFrame window
        JFrame frame = new JFrame("Welcome!");

        // set the size of the window
        frame.setSize(600, 400);

        // set the position of the window on the screen
        frame.setLocationRelativeTo(null);

        // create a new JPanel component to hold the components
        JPanel panel = new JPanel();

        // create a new JLabel component
        JLabel label = new JLabel("Welcome to my program!");

        // create a new JButton component
        JButton button = new JButton("Exit");

        // set the preferred size of the button
        button.setPreferredSize(new Dimension(100, 50));

        // sets the background color to a shade of blue
        button.setBackground(new Color(30, 144, 255));

        // remove the border from the button
        button.setBorderPainted(false);

        // add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Goodbye!", "Alert BOXXXXX", JOptionPane.WARNING_MESSAGE);
                // exit the program
                System.exit(0);
            }
        });

        // add the JLabel and the JButton to the JPanel
        panel.add(label);

        // add a FlowLayout to the panel with right alignment
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // add the button to the panel
        panel.add(button);

        // add the JPanel to the JFrame
        frame.add(panel, BorderLayout.CENTER);

        // make the window visible
        frame.setVisible(true);
    }
}
