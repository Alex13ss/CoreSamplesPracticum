package ua.natl.CSPsynchroThread;

public class Worker implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<1007; i++) {
			Main.increaseNumber();
		}
	}
}