package chapter2.atomicIntergerNoSafe.src.service;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

	public static AtomicLong aiRef = new AtomicLong();

	public void addNum() {
		System.out.println(Thread.currentThread().getName() + "����100֮���ֵ��:"
				+ aiRef.addAndGet(100));
		aiRef.addAndGet(1);
	}

}
