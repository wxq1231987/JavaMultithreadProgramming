package chapter2.setNewPropertiesLockOne.src.service;

import chapter2.setNewPropertiesLockOne.src.entity.Userinfo;

public class Service {

	public void serviceMethodA(Userinfo userinfo) {
		synchronized (userinfo) {
			try {
				System.out.println(Thread.currentThread().getName() + " begin");
				userinfo.setUsername("abcabcabc");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " end");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
