package chapter2.synTwoLock.src.test;

import chapter2.synTwoLock.src.service.Service;
import chapter2.synTwoLock.src.extthread.ThreadA;
import chapter2.synTwoLock.src.extthread.ThreadB;
import chapter2.synTwoLock.src.extthread.ThreadC;
/**
 * 验证synchronized加在static方法上的锁和加在静态方法上的锁不是同一个，
 * 一个是对象锁，另一个是Class锁
 * @author Tina
 *
 */
public class Run {

	public static void main(String[] args) {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();

	}

}
