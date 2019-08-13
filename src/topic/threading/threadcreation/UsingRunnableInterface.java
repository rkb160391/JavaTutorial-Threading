package topic.threading.threadcreation;

class UsingRunnableInterface implements Runnable{
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		UsingRunnableInterface m1 = new UsingRunnableInterface();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}