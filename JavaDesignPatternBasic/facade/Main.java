package facade;

//클라이언트는 복잡한 내부 로직을 몰라도 값을 입력만 하면 원라는 결과를 얻을 수 있다
//클라이언트에게는 입력화면만 제공
public class Main{
    public static void main(String[] args){
        //예를들어 환영인사 페이지를 생성하는 결과를 얻고 싶다면 클라이언트는 이메일 주소와 파일명만 입력하면 된다
        PageMaker.makeWelcomePage("wonjun@abc.com", "Welcome.html");
    }
}