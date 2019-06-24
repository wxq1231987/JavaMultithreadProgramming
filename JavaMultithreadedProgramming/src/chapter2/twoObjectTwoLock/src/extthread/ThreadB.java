package chapter2.twoObjectTwoLock.src.extthread;

import chapter2.twoObjectTwoLock.src.service.HasSelfPrivateNum;

public class ThreadB extends Thread {

	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
