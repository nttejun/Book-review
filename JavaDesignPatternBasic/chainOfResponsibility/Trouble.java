package chainOfResponsibility;

// 어떤 Trouble이 발생했는지를 보여준다
public class Trouble {
    private int number;
    public Trouble(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return "[Trouble " + number + "]";
    }
}