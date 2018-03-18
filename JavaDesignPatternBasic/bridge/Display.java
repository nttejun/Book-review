package bridge;

public class Display{
	// bridge 역할
	// impl은 구현할 인스턴스
	private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public void display(){
        open();
        print();
        close();
    }
}

