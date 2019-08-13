package topic.threading.synchronization;


class MyThread5 extends Thread {
	Table t;

	MyThread5(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTableWithSynchronizeBlock(5);
	}

}

class MyThread6 extends Thread {
	Table t;

	MyThread6(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTableWithSynchronizeBlock(100);
	}
}

public class TestSynchronizedBlock1 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread6 t1 = new MyThread6(obj);
		MyThread5 t2 = new MyThread5(obj);
		t1.start();
		t2.start();
	}
}