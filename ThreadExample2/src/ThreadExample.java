
public class ThreadExample implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
