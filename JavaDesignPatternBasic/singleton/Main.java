package singleton;

public class Main {
	public static void main(String[] args ) {
		Singleton first = Singleton.getInstance();
		Singleton second = Singleton.getInstance();
		if(first == second) {
			System.out.println("equal instance");
		} else {
			System.out.println("not equal instance");
		}
	}
}
