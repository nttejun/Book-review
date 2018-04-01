package chainOfResponsibility;

// Trouble 해결을 위해 Support를 연결하는 추상클래스
public abstract class Support {
    private String name;
    private Support next;

    // 다음 곳 지정
    public Support (String name){
        this.name = name;
    }

    // 다음 곳 설정
    public Support setNext(Support next){
        this.next = next;
        return next;
    }
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        } else if (next != null){
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
    public String toString(){
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble);
    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble){
        System.out.println(trouble + " cannot be resolved.");
    }
}