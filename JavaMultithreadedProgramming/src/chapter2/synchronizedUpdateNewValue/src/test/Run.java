package chapter2.synchronizedUpdateNewValue.src.test;

import chapter2.synchronizedUpdateNewValue.src.service.Service;
import chapter2.synchronizedUpdateNewValue.src.extthread.ThreadA;
import chapter2.synchronizedUpdateNewValue.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB(service);
			b.start();

			System.out.println("已经发起停止的命令了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
