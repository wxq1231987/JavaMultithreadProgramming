package chapter2.synchronizedBlockLockAll.src.test3.run;

import chapter2.synchronizedBlockLockAll.src.test3.extobject.MyObject;
import chapter2.synchronizedBlockLockAll.src.test3.extthread.ThreadA;
import chapter2.synchronizedBlockLockAll.src.test3.extthread.ThreadB;
import chapter2.synchronizedBlockLockAll.src.test3.service.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyObject object = new MyObject();

		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		a.start();

		Thread.sleep(100);

		ThreadB b = new ThreadB(object);
		b.setName("b");
		b.start();
	}

}
