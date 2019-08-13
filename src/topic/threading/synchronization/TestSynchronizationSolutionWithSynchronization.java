package topic.threading.synchronization;

public class TestSynchronizationSolutionWithSynchronization {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread3 t1 = new MyThread3(obj);
		MyThread4 t2= new MyThread4(obj);
		t1.start();
		t2.start();
	}
}

class MyThread3 extends Thread {
	Table t;

	MyThread3(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTableWithSynchronization(5);
	}

}

class MyThread4 extends Thread {
	Table t;

	MyThread4(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTableWithSynchronization(100);
	}
}
