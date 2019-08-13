package topic.threading.synchronization;

public class TestSynchronizationByAnnonymousClass {
	public static void main(String args[]) {
		final Table obj = new Table();// only one object

		Thread t1 = new Thread() {
			public void run() {
				obj.printTableWithSynchronization(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				obj.printTableWithSynchronization(100);
			}
		};

		t1.start();
		t2.start();
	}
}