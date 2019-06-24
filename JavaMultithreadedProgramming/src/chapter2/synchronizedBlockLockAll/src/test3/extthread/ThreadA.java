package chapter2.synchronizedBlockLockAll.src.test3.extthread;

import chapter2.synchronizedBlockLockAll.src.test3.extobject.MyObject;
import chapter2.synchronizedBlockLockAll.src.test3.service.Service;

public class ThreadA extends Thread {

	private Service service;
	private MyObject object;

	public ThreadA(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		service.testMethod1(object);
	}

}
