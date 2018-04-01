package chainOfResponsibility;

// 제한번호 미만에 대한 문제를 해결하는 클래스
public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit){
        super(name);
        this.limit = limit;
    }
    protected boolean resolve(Trouble trouble){
        if(trouble.getNumber() < limit){
            return true;
        } else {
            return false;
        }
    }
}