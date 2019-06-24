package chapter2.twoStop.src.test.run;

import chapter2.twoStop.src.service.Service;
import chapter2.twoStop.src.extthread.ThreadA;
import chapter2.twoStop.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		ThreadA athread = new ThreadA(service);
		athread.start();

		ThreadB bthread = new ThreadB(service);
		bthread.start();
	}

}
