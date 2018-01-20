package edu.asu.swing.main;

import javax.swing.JFrame;

import edu.asu.swing.group5.P107_Srivastava_Tab;

public class MainApplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6349067609212857100L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Main");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(800, 800);
	    frame.setLocation(200, 200);
	    
	    frame.setContentPane(new P107_Srivastava_Tab());
	    frame.setVisible(true);
	}

	
	
}
