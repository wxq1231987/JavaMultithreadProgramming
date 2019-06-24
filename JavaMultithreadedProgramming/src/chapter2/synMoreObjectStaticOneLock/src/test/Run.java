package chapter2.synMoreObjectStaticOneLock.src.test;

import chapter2.synMoreObjectStaticOneLock.src.service.Service;
import chapter2.synMoreObjectStaticOneLock.src.extthread.ThreadA;
import chapter2.synMoreObjectStaticOneLock.src.extthread.ThreadB;
/**
 * ��֤class�������еĶ���̬����������
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
