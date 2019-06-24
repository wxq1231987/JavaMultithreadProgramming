package chapter1.countPriority.src.test;

import chapter1.countPriority.src.extthread.ThreadA;
import chapter1.countPriority.src.extthread.ThreadB;
/**
 * 验证线程的优先级越高运行越快
 * @author Tina
 *
 */
public class Run {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			System.out.println("a:" + a.getPriority());
			a.start();

			ThreadB b = new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			System.out.println("b:" + b.getPriority());
			b.start();

			Thread.sleep(20000);
			a.stop();
			b.stop();

			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
