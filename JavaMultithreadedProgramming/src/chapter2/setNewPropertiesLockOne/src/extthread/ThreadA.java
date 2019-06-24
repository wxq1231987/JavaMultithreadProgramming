package chapter2.setNewPropertiesLockOne.src.extthread;

import chapter2.setNewPropertiesLockOne.src.service.Service;
import chapter2.setNewPropertiesLockOne.src.entity.Userinfo;

public class ThreadA extends Thread {

	private Service service;
	private Userinfo userinfo;

	public ThreadA(Service service, 
			Userinfo userinfo) {
		super();
		this.service = service;
		this.userinfo = userinfo;
	}

	@Override
	public void run() {
		service.serviceMethodA(userinfo);
	}

}
