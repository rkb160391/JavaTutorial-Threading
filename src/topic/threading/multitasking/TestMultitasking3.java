package topic.threading.multitasking;

class TestMultitasking3 extends Thread {
	public void run() {
		System.out.println("task one");
	}
	public static void main(String args[]) {
		TestMultitasking3 t1 = new TestMultitasking3();
		Simple2 t2 = new Simple2();

		t1.start();
		t2.start();
	}
}

class Simple2 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}
