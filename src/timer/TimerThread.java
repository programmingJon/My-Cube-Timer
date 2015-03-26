package timer;

public class TimerThread implements Runnable {

	long startTime;
	long endTime;
	long elapsedTime;
	boolean running;
	
	public void run(){
		this.startTime = System.currentTimeMillis();
		running = true;
	}
	
	public long getElapsedTime(){
		if (running){
			this.elapsedTime = System.currentTimeMillis() - this.startTime;
		}
		return this.elapsedTime;
	}
	
	public void stopTimer(){
		this.endTime = System.currentTimeMillis();
		this.elapsedTime = this.endTime - this.startTime;
	}
}
