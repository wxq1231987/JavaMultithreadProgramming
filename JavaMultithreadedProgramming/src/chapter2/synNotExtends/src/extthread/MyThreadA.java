package chapter2.synNotExtends.src.extthread;

import chapter2.synNotExtends.src.service.Sub;

public class MyThreadA extends Thread {

	private Sub sub;

	public MyThreadA(Sub sub) {
		super();
		this.sub = sub;
	}

	@Override
	public void run() {
		sub.serviceMethod();
	}

}
