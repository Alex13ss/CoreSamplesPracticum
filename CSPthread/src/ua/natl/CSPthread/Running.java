package ua.natl.CSPthread;

import java.util.Random;

public class Running implements Runnable {
	int time;
	String name;
	Random r = new Random();
	
	public Running(String name) {
		this.name = name;
		time = r.nextInt(5800);
	}
	
	@Override
	public void run() {		
		System.out.printf("Thread %s sleeps %d ms.\n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e) {e.getMessage();}
		System.out.printf("Thread %s woken up and now you know it.\n", name);
	}
}