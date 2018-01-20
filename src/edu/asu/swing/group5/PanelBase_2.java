package edu.asu.swing.group5;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelBase_2 extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelBase_2() {
		setLayout(new GridLayout(0, 5));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
        
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		
		
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		
		
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		
		
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		
		
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
		add(new Panel_2(), gbc);
	}

}
