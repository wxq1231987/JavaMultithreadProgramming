package chapter2.synTwoLock.src.extthread;

import chapter2.synTwoLock.src.service.Service;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printA();
	}

}
