package gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

import controller.Controller;
import scrambler.ScrambleGenerator;


public class CubePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	GridBagConstraints c;
	ScrambleGenerator sg;
	Controller controller;
	
	public CubePanel(Controller controller){
		sg = new ScrambleGenerator(6);
		sg.generateLength(25);
		this.controller = controller;
		this.initPanel();
	}
	
	public void initPanel(){
		
		this.setLayout(new GridBagLayout());
		this.setBackground(new Color(255,255,255));
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridheight = 4;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;
		c.ipady = 40;
		JLabel scrambleArea = new JLabel(sg.getGeneratedScramble().toString());
		this.add(scrambleArea);
		c.gridx = 0;
		c.gridy = 1;
		this.setVisible(true);
		
	}

}
