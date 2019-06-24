package chapter2.t2.src.test;

import chapter2.t2.src.service.HasSelfPrivateNum;
import chapter2.t2.src.extthread.ThreadA;
import chapter2.t2.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef);
		athread.start();

		ThreadB bthread = new ThreadB(numRef);
		bthread.start();

	}

}
