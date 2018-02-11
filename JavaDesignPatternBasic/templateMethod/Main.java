package templateMethod;

//일반열차, 급행열차 템플릿 메서드 사용
public class Main {
	public static void main (String args[]) {
		DisplayAbstraction displayA = new NomalAbstraction("하9999");
		DisplayAbstraction displayB = new ExpressAbstraction("가1111");
		DisplayAbstraction displayC = new ExpressAbstraction("가1234");
		
		displayA.display();
		displayB.display();
		displayC.display();
	}
}
