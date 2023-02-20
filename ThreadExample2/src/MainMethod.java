
public class MainMethod {
	public static void main(String[] args) {

		ThreadExample ex = new ThreadExample();
		Thread thread1 = new Thread(ex);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadExample ex1 = new ThreadExample();
		Thread thread2 = new Thread(ex1);
		thread2.start();
	}

}
