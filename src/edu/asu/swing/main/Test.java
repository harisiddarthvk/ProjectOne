package edu.asu.swing.main;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            add(new TopPane(), gbc);

            gbc.weightx = 0.5;
            gbc.gridy++;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.gridwidth = 1;
            add(new CheckerPane(), gbc);

            gbc.gridx++;
            add(new JButton("Button"), gbc);
        }

    }

    public class TopPane extends JPanel {

        public TopPane() {
            setLayout(new GridLayout(0, 5));
            add(new JLabel("label1", JLabel.CENTER));
            add(new JLabel("label2", JLabel.CENTER));
            add(new JLabel("label3", JLabel.CENTER));
            add(new JLabel("label4", JLabel.CENTER));
        }

    }


    public class CheckerPane extends JPanel {

        public CheckerPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            add(new JCheckBox("Tick box 1"), gbc);
            gbc.gridx++;
            add(new JCheckBox("Tick box 2"), gbc);
            gbc.gridx = 0;
            gbc.gridy++;
            add(new JCheckBox("Tick box 3"), gbc);
            gbc.gridx++;
            add(new JCheckBox("Tick box 4"), gbc);
        }

    }

}