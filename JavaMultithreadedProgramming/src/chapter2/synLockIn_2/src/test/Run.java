package chapter2.synLockIn_2.src.test;

import chapter2.synLockIn_2.src.extthread.MyThread;

public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
