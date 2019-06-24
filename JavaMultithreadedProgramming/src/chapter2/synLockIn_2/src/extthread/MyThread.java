package chapter2.synLockIn_2.src.extthread;

import chapter2.synLockIn_2.src.myservice.Main;
import chapter2.synLockIn_2.src.myservice.Sub;

public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
