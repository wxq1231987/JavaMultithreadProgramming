package chapter2.synBlockMoreObjectOneLock.src.test;

import chapter2.synBlockMoreObjectOneLock.src.service.Service;
import chapter2.synBlockMoreObjectOneLock.src.extthread.ThreadA;
import chapter2.synBlockMoreObjectOneLock.src.extthread.ThreadB;
/**
 * 验证synchronized(class)代码块的作用和synchronized static 方法一样
 * @author Tina
 *
 */
public class Run {

	public static void main(String[] args) {

		Service service1 = new Service();
		Service service2 = new Service();

		ThreadA a = new ThreadA(service1);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service2);
		b.setName("B");
		b.start();

	}

}
