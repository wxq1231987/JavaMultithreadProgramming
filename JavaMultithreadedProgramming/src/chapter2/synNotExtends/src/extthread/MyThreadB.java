package chapter2.synNotExtends.src.extthread;

import chapter2.synNotExtends.src.service.Sub;

public class MyThreadB extends Thread {

	private Sub sub;

	public MyThreadB(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}
}
