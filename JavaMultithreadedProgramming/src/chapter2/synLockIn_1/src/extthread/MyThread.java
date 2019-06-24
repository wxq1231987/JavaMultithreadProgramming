package chapter2.synLockIn_1.src.extthread;

import chapter2.synLockIn_1.src.myservice.Service;

public class MyThread extends Thread {
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
