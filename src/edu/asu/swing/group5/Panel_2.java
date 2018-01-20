package edu.asu.swing.group5;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -47793851111493159L;
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Panel_2() {
		
		setLayout(new GridBagLayout());
	    gbc.weightx = 1.0;
	    gbc.weighty = 1.0;
	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    
	    setBorder(BorderFactory.createLineBorder(Color.black));
	    
	    addAtPosition(new JLabel("Last name", JLabel.CENTER), 0, 0);
	    addAtPosition(new JLabel("First Name", JLabel.CENTER), 0, 1);
	    addAtPosition(new JLabel("No Timer", JLabel.CENTER), 0, 2);
	    
	    setVisible(true);
	}
	
	void addAtPosition(Component component, int x, int y) {
	    gbc.gridx = x;
	    gbc.gridy = y;
	    add(component, gbc);
	  }

}
