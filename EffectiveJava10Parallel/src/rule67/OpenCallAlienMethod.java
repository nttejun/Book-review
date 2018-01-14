package rule67;

// 동기화 영역 밖에서 호출하는 Open call
// 동기화 영역 밖에서 복사본을 사용해 병행성을 보장
public class OpenCallAlienMethod {
    private void notifyElementAdded(E element){
        List<SetObserver<E>> snapshot = null;
        synchronized (observers){
            snapshot = new ArrayList<SetObserver<E>>(observers);
        }
        for(SetObserver<E> observer : snapshot)
            observer.added(this, element);
    }
}
