package Semaphore;

import Semaphore.Semaphores.atmThread;

class appMain {
	public static void main(String[] args) {
		atmThread thr1 = new atmThread("name1");
		atmThread thr2 = new atmThread("name2");
		atmThread thr3 = new atmThread("name3");
		atmThread thr4 = new atmThread("name4");
		atmThread thr5 = new atmThread("name5");
		atmThread thr6 = new atmThread("name6");
		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();
		thr6.start();
	}
}