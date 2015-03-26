package controller;

import timer.TimerThread;

public class Controller {

	Runnable timer;
	
	public Controller(TimerThread timer) {

		this.timer = timer;
		
	}

}