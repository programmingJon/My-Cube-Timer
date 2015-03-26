package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Controller;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Controller c;
	
	public MyFrame(Controller c, int width, int height){
		JPanel panel = new CubePanel(c);
		this.setContentPane(panel);
		this.setSize(width, height);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}