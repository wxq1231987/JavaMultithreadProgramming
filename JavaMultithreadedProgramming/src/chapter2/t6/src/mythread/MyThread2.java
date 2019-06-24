package chapter2.t6.src.mythread;

import chapter2.t6.src.commonutils.CommonUtils;

import chapter2.t6.src.mytask.Task;

public class MyThread2 extends Thread {

	private Task task;

	public MyThread2(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}

}
