package bridge;
// DisplayImpl 기능을 구현하는 하위클래스
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void rawOpen() {
        printLine();
    }
    public void rawPrint() {
        System.out.println(" " + string + " ");
    }
    public void rawClose() {
            printLine();
    }
    private void printLine(){
        System.out.println("'-' print start");
        for(int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println(" ");
        System.out.println("'-' print end");
    }
}
