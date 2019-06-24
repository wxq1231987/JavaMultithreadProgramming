package chapter2.synchronizedOneThreadIn.src.extthread;

import chapter2.synchronizedOneThreadIn.src.service.ObjectService;

public class ThreadA extends Thread {

	private ObjectService service;

	public ThreadA(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}

}
