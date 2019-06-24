package chapter2.synchronizedUpdateNewValue.src.extthread;

import chapter2.synchronizedUpdateNewValue.src.service.Service;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.stopMethod();
	}

}
