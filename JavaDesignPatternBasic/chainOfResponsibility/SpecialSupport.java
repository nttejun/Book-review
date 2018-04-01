package chainOfResponsibility;

// 지정한 번호의 트러블에 한해 처리하는 클래스
public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport(String name, int number){
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble){
        if(trouble.getNumber() == number){
            return true;
        } else {
            return false;
        }
    }
}