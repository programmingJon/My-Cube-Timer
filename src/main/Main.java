package main;

import gui.MyFrame;
import controller.Controller;
import timer.TimerThread;

public class Main {

	public static void main(String[] args){
		TimerThread timer = new TimerThread();
		
		Controller c = new Controller(timer);
		/*JFrame gui =*/ new MyFrame(c, 600, 400);
		
	}
	
}