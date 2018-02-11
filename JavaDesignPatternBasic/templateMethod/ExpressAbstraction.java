package templateMethod;

public class ExpressAbstraction extends DisplayAbstraction {

	private String race;
	private String[] expressNumber = {"가1111", "나2222", "다3333"};
	
	public ExpressAbstraction (String race) {
		this.race = race;
	}

	@Override
	public void print() {
		if(chkNomalAndExpress() == true) {
			System.out.println("이번열차 " + race + "는 급행열차입니다");
		} else {
			System.out.println("이번열차 " + race + "는 일반열차입니다");
		}
	}
	
	@Override
	public void start() {
		System.out.println("*");
	}

	@Override
	public void end() {
		System.out.println("*");
		System.out.println(" ");
	}
	
	public boolean chkNomalAndExpress() {
		for(String index : expressNumber) {
			if(race == index) {
				return true;
			}
		}
		return false;
	}

}
