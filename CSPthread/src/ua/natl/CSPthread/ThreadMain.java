package ua.natl.CSPthread;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Running("1"));
		Thread t2 = new Thread(new Running("2"));
		Thread t3 = new Thread(new Running("3"));
		t1.start();
		t2.start();
		t3.start();
	}
}