package chapter2.t7.src.mytask;

public class Task {

	public void doLongTimeTask() {
		for (int i = 0; i < 10; i++) {
			System.out.println("nosynchronized threadName="
					+ Thread.currentThread().getName() + " i=" + (i + 1));
		}
		System.out.println("");
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("synchronized threadName="
						+ Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}

	}
}
