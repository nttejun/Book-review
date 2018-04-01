package chainOfResponsibility;

/*
    요구와 처리의 변경을 유연하게 해야하는 경우 사용하면 좋다

    요구자
    요구 1 ->
    요구 2 ->
    요구 3 ->

    -> 어떤 처리에 연결할지 결정하는 역할을 분리시켰다

    처리자
    -> 처리 1
    -> 처리 2
    -> 처리 3
 */

public class Main {
    public static void main(String[] args){
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        // 사슬
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        // 트러블 실행
        for(int i=0; i<500; i+=33){
            alice.support(new Trouble(i));
        }
    }
}