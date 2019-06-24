package chapter2.t9.src.mythread;

import chapter2.t9.src.mylist.MyOneList;
import chapter2.t9.src.service.MyService;

public class MyThread1 extends Thread {

	private MyOneList list;

	public MyThread1(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}

}