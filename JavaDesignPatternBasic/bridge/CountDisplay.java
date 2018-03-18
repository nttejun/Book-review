package bridge;
// Display 기능을 추가한 클래스
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl){
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for(int i = 0; i < times; i++){
            print();
        }
        close();
    }
}
