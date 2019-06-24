package chapter2.twoObjectTwoLock.src.test;

import chapter2.twoObjectTwoLock.src.service.HasSelfPrivateNum;
import chapter2.twoObjectTwoLock.src.extthread.ThreadA;
import chapter2.twoObjectTwoLock.src.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {

		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();

		ThreadA athread = new ThreadA(numRef1);
		athread.start();

		ThreadB bthread = new ThreadB(numRef2);
		bthread.start();

	}

}
