package chapter2.StringAndSyn2.src.extthread;

import chapter2.StringAndSyn2.src.service.Service;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print(new Object());
	}
}
