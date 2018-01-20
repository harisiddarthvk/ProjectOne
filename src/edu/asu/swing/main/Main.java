package edu.asu.swing.main;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
  GridBagConstraints constraints = new GridBagConstraints();

  public Main() {
    setLayout(new GridBagLayout());
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    constraints.fill = GridBagConstraints.BOTH;
    int x, y; // for clarity
    addGB(new JButton("North"), x = 1, y = 0);
    addGB(new JButton("West"), x = 0, y = 1);
    addGB(new JButton("Center"), x = 1, y = 1);
    addGB(new JButton("East"), x = 2, y = 1);
    addGB(new JButton("South"), x = 1, y = 2);
  }

  void addGB(Component component, int x, int y) {
    constraints.gridx = x;
    constraints.gridy = y;
    add(component, constraints);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Main");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    frame.setLocation(200, 200);
    frame.setContentPane(new Main());
    frame.setVisible(true);
  }
}
