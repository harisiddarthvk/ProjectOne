package edu.asu.swing.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApplication frame = new MainApplication();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					
					
					JTabbedPane jTabbedPane = new JTabbedPane();
					
					
					jTabbedPane.addTab("Tab 5", new P107_Srivastava_Tab());
					
					
					frame.add(jTabbedPane);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		
	}

}
