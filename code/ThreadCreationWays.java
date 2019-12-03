// There are 2 ways to create a thread in Java. The first one is by Extending the Thread class and the second one is by implementing the runnable interface.

// 1st way
class MyThread extends Thread {
	public void run() {
		System.out.println("concurrent thread started running..");
	}

}

classMyThreadDemo{
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		mt.start();
	}
}

// 2nd way
class MyThread implements Runnable {
	public void run() {
		System.out.println("concurrent thread started running..");
	}
}

class MyThreadDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}
}
