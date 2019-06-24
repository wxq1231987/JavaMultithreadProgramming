package chapter2.synchronizedBlockLockAll.src.test3.extthread;

import chapter2.synchronizedBlockLockAll.src.test3.extobject.MyObject;

public class ThreadB extends Thread {
	private MyObject object;

	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
