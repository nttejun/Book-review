package rule42;

// 인자를 0개 이상 받을 수 있는 varargs
public class Varargs {
    // varargs basic case
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    // 메서드 인자 1개 받아서 사용하는 경우
    // 최소값 1개 반환하기
    static int min(int... args) throws IllegalAccessException {
        // args 명시적으로 검사하는 안좋은 코드
        if (args.length == 0) {
            throw new IllegalAccessException("Too few arguments");
        }
        int min = args[0];
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }

    // 메서드 인자 2개 받아서 사용하는 경우
    // 최소값 1개 반환하기 리펙토링
    // 메서드 인자로 지정된 자료형을 가진 일반인자, 동일한 자료형을 가진 varargs 인자
    static int refactoringMin(int argsType, int... args) {
        int min = argsType;
        for (int arg : args)
            if (arg < min)
                min = arg;
        return min;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Varargs varargs = new Varargs();
        System.out.println(varargs.sum());
        System.out.println(varargs.min(1, 2));
        System.out.println(varargs.refactoringMin(4, 3, 4, 2, 4));
    }
}

