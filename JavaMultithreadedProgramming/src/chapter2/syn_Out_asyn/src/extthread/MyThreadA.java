package chapter2.syn_Out_asyn.src.extthread;

import chapter2.syn_Out_asyn.src.mylist.MyList;

public class MyThreadA extends Thread {

	private MyList list;

	public MyThreadA(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add("threadA" + (i + 1));
		}
	}

}
