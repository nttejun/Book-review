package rule67;

import java.util.concurrent.CopyOnWriteArrayList;

// 병행성 컬렉션 CopyOnWriteArrayList
public class CopyOnWriteArr {
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<SetObserver<E>>();
    public void addObserver(SetObserver<E> observer){
        observers.add(observer);
    }
    public boolean removeObserver(SetObserver<E> observer){
        return observers.remove(observer);
    }
    private void notifyElementAdded(E element){
        for(SetObserver<E> observer : observers)
            observer.added(this, element);
    }
}
