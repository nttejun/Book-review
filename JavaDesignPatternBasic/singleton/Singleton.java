package singleton;

public class Singleton {
	// Singleton 인스턴스는 유일한 1개다
	// static method는 동일한 인스턴스 반환을 약속한다
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("인스턴스 생성");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
