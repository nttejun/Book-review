package chainOfResponsibility;

// 홀수 번호의 트러블을 처리하는 클래스
public class OddSupport extends Support{
    public OddSupport(String name){
        super(name);
    }
    protected boolean resolve(Trouble trouble){
        if(trouble.getNumber() % 2 == 1){
            return true;
        } else {
            return false;
        }
    }
}