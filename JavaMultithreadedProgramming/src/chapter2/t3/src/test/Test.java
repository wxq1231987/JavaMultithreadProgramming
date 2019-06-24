package chapter2.t3.src.test;

import chapter2.t3.src.entity.PublicVar;
import chapter2.t3.src.extthread.ThreadA;

public class Test {

	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);// 打印结果受此值大小影响

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
