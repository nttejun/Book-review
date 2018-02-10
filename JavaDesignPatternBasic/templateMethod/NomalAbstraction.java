package templateMethod;

public class NomalAbstraction extends DisplayAbstraction {

	private String race;
	
	public NomalAbstraction(String race) {
		this.race = race;
	}

	@Override
	public void print() {
		start();
		System.out.println("이번열차 " + race + "는 일반열차입니다");
		end();
	}

	@Override
	public void start() {
		System.out.println("**");
	}

	@Override
	public void end() {
		System.out.println("**");
		System.out.println(" ");
	}
}
