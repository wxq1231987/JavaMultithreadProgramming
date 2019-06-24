package chapter2.StringAndSyn2.src.test;

import chapter2.StringAndSyn2.src.service.Service;
import chapter2.StringAndSyn2.src.extthread.ThreadA;
import chapter2.StringAndSyn2.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
