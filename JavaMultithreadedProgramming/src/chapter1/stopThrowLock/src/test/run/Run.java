package chapter1.stopThrowLock.src.test.run;

import chapter1.stopThrowLock.src.testpackage.MyThread;
import chapter1.stopThrowLock.src.testpackage.SynchronizedObject;

public class Run {
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername() + " "
					+ object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
