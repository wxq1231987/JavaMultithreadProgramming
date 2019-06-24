package chapter2.synchronizedOneThreadIn.src.test.run;

import chapter2.synchronizedOneThreadIn.src.service.ObjectService;
import chapter2.synchronizedOneThreadIn.src.extthread.ThreadA;
import chapter2.synchronizedOneThreadIn.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
