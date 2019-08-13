package topic.threading.synchronization;

public class TestSynchronizationStaticSynchronization {
	public static void main(String t[]) {
		MyThread7 t3 = new MyThread7();
		MyThread8 t4 = new MyThread8();
		MyThread9 t5 = new MyThread9();
		t3.start();
		t4.start();
		t5.start();
	}
}

class MyThread7 extends Thread {
	public void run() {
		Table.printTableWithStaticBlock(5);
	}
}

class MyThread8 extends Thread {
	public void run() {
		Table.printTableWithStaticBlock(50);
	}
}

class MyThread9 extends Thread{
	public void run() {
		Table.printTableClassLock(1000);
	}
}