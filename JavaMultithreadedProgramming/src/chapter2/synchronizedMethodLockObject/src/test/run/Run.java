package chapter2.synchronizedMethodLockObject.src.test.run;

import chapter2.synchronizedMethodLockObject.src.extobject.MyObject;
import chapter2.synchronizedMethodLockObject.src.extthread.ThreadA;
import chapter2.synchronizedMethodLockObject.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");

		a.start();
		b.start();
	}

}
