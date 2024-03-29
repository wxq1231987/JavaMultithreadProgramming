package chapter2.t6.src.test;

import chapter2.t6.src.mytask.Task;
import chapter2.t6.src.mythread.MyThread1;
import chapter2.t6.src.mythread.MyThread2;

import chapter2.t6.src.commonutils.CommonUtils;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long beginTime = CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}

		long endTime = CommonUtils.endTime1;
		if (CommonUtils.endTime2 > CommonUtils.endTime1) {
			endTime = CommonUtils.endTime2;
		}

		System.out.println("��ʱ��" + ((endTime - beginTime) / 1000));
	}
}
