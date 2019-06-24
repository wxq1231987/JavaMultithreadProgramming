package chapter2.StringAndSyn.src.extthread;

import chapter2.StringAndSyn.src.service.Service;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print("AA");
	}
}
