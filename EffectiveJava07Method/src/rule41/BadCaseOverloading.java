package rule41;

import java.math.BigInteger;
import java.util.*;

// 오버로딩은 컴파일 시점에 인자의 자료를 근거로 선택한다
public class BadCaseOverloading {
    public static String classify(Set<?> set) {
        return "Set";
    }

    public static String classify(List<?> list) {
        return "List";
    }

    // 기존방식
    public static String classify(Collection<?> collection) {
        return "Unknown Collection";
    }

    // 오버로딩을 사용해야 한다면 개선한 방안
    public static String classifyCheck(Collection<?> collection) {

        // 타입체크 추가
        return collection instanceof Set ? "Set" :
                collection instanceof List ? "List" : "Unknown Collection";

    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        // 기본방식 three times print collection
        for (Collection<?> collection : collections)
            System.out.println(classify(collection));

        // 개선방안 after type check print collection
        for (Collection<?> collection : collections)
            System.out.println(classifyCheck(collection));
    }
}

