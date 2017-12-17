package rule42;

// 인자 리스트를 모두 받을 수 있는 상황은 컴파일 오류도 발생하지 않기 때문에 조심해야 한다
public class DangerCaseVarargs {
    static Object dangerArgsType1(Object... args) {
        return args;
    }

    static <T> T dangerArgsType2(T... args) {
        return (T) args;
    }

    public static void main(String[] args){
        dangerArgsType1(10, "문자");
        dangerArgsType2(10, "문자");
    }
}
