package chapter2.synMoreObjectStaticOneLock.src.extthread;

import chapter2.synMoreObjectStaticOneLock.src.service.Service;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.printB();
	}
}
