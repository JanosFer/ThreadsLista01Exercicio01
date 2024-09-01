package controller;

public class ThreadIdController extends Thread{
	public ThreadIdController() {
		super();
	}
	
	public void run() {
		int tid = (int) getId();
		System.out.println("#"+tid);
	}
}
