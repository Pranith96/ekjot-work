
public class MainMethod {

	public static void main(String[] args) {
		ThreadClassExample ex = new ThreadClassExample();
		ex.start();
		ThreadClassExample ex1 = new ThreadClassExample();
		ex1.start();
	}

}
