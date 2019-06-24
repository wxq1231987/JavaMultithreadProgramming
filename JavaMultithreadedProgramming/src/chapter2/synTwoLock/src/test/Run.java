package chapter2.synTwoLock.src.test;

import chapter2.synTwoLock.src.service.Service;
import chapter2.synTwoLock.src.extthread.ThreadA;
import chapter2.synTwoLock.src.extthread.ThreadB;
import chapter2.synTwoLock.src.extthread.ThreadC;
/**
 * ��֤synchronized����static�����ϵ����ͼ��ھ�̬�����ϵ�������ͬһ����
 * һ���Ƕ���������һ����Class��
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
